package com.ps.ranjith.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ps.ranjith.model.Country;
import com.ps.ranjith.model.Standing;

@Service
public class FootballAppService {

	@Autowired
	RestTemplate restTemplate;
	
	@Value( "${api.v1}" )
	private String apiEndpointOne;
	
	@Value( "${api.v2}" )
	private String apiEndpointTwo;

	@Value( "${api.key:9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978}" )
	private String APIKey;


	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public void setAPIKey(String aPIKey) {
		APIKey = aPIKey;
	}


	/**
	 * Get standing details for the given league ID
	 * @param league_id
	 * @return
	 * @throws JsonMappingException
	 * @throws JsonProcessingException
	 */
	private Standing getStanding(final String league_id) throws JsonMappingException, JsonProcessingException {
		Standing returnStanding = null;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		ObjectMapper objMapper = new ObjectMapper();
		
		String responseStr = restTemplate.exchange(apiEndpointOne+"?action=get_standings&league_id="+league_id+"&APIkey="+APIKey, 
				HttpMethod.GET, entity, String.class).getBody();
		returnStanding = objMapper.readValue(responseStr, Standing.class);
		return returnStanding;

	}

	/**
	 * Gets all countries details
	 * @return
	 * @throws JsonMappingException
	 * @throws JsonProcessingException
	 */
	private List<Country> getAllCountries() throws JsonMappingException, JsonProcessingException{
		List<Country> countriesList = new ArrayList<Country>();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity <String> entity = new HttpEntity<String>(headers);
		ObjectMapper objMapper = new ObjectMapper();
		String countryRes = restTemplate.exchange(apiEndpointTwo+"?action=get_countries&APIkey="+APIKey, 
				HttpMethod.GET, entity, String.class).getBody(); 
		countriesList = objMapper.readValue(countryRes, new TypeReference<List<Country>>() {
		}) ;
		return countriesList;

	}

	/**
	 * Get standing for the specific league ID
	 * @param standingLeagueId
	 * @return
	 * @throws JsonMappingException
	 * @throws JsonProcessingException
	 */
	public String getStandingsList(String standingLeagueId) throws JsonMappingException, JsonProcessingException {	

		Map<String, String> returnMap = new HashMap<String, String>();
		Standing fetchedStanding = getStanding(standingLeagueId);

		if(fetchedStanding!=null) {
			List<Country> countriesList = getAllCountries();
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
		if(returnMap.isEmpty()) {
			return "Standings details not found!";
		}

		ObjectMapper objMapper = new ObjectMapper();
		return objMapper.writeValueAsString(returnMap);



	}

	public void setApiEndpointOne(String apiEndpointOne) {
		this.apiEndpointOne = apiEndpointOne;
	}

	public void setApiEndpointTwo(String apiEndpointTwo) {
		this.apiEndpointTwo = apiEndpointTwo;
	}

	

}
