package com.ps.ranjith.controller;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ps.ranjith.model.Country;
import com.ps.ranjith.model.Standing;

@RestController
public class FootballApplicationStandingController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/getStandings/{id}")
	public String getFootballStandings(@PathVariable String id) throws JsonMappingException, JsonProcessingException {
		return getStandingsList(id);
	}




	public String getStandingsList(String id) throws JsonMappingException, JsonProcessingException {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		Map<String, String> returnMap = new HashMap<String, String>();
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		ObjectMapper objMapper = new ObjectMapper();

		String responseStr = restTemplate.exchange("https://apifootball.com/api/?action=get_standings&league_id="+id+"&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", 
				HttpMethod.GET, entity, String.class).getBody();
		String countryRes = restTemplate.exchange("https://apiv2.apifootball.com/?action=get_countries&APIkey=9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978", 
				HttpMethod.GET, entity, String.class).getBody(); 
		List<Country> countriesList = objMapper.readValue(countryRes, new TypeReference<List<Country>>() {
		}) ;

		Standing fetchedStanding = objMapper.readValue(responseStr, Standing.class);
		if(fetchedStanding!=null) {
			System.out.println("standing:"+fetchedStanding);
			String countryName = fetchedStanding.getCountryName();
			String countryId = null;
			if(countryName!=null && !countryName.trim().equalsIgnoreCase("") && countriesList!=null &&
					!countriesList.isEmpty()) {
				Optional<Country> opt = countriesList.stream().filter(country -> 
				country.getCountryName().equalsIgnoreCase(countryName)
						).findFirst();
				Country countryFetched = opt.get();
				if(countryFetched!=null) {
					countryId = countryFetched.getCountryId();
				}
			}

			if(countryId!=null) {
				returnMap.put(countryId, countryName);
			}
			if(fetchedStanding.getLeagueId()!=null) {
				returnMap.put(fetchedStanding.getLeagueId(), fetchedStanding.getLeagueName());
			}
			if(fetchedStanding.getTeamId()!=null) {
				returnMap.put(fetchedStanding.getTeamId(), fetchedStanding.getTeamName());
			}
			if(fetchedStanding.getOverallLeaguePosition()!=null) {
				returnMap.put("League Position -", fetchedStanding.getOverallLeaguePosition());
			}
		}
		
		return objMapper.writeValueAsString(returnMap);
	}

}
