package com.ps.ranjith.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.ranjith.app.exceptions.CustomGameException;
import com.ps.ranjith.service.FootballAppService;

@RestController
public class FootballApplicationStandingController {

	@Autowired
	FootballAppService footballService;
	

	@RequestMapping("/getStandings/{id}")
	public String getFootballStandings(@PathVariable String id) throws CustomGameException {
		return getStandingsList(id);
	}


	public String getStandingsList(String standingLeagueId) throws CustomGameException {
		String returnStandingDetails = null;
		try {
			returnStandingDetails = footballService.getStandingsList(standingLeagueId);
		}catch(Exception e) {
			throw new CustomGameException(e.getMessage(), e);
		}
		return returnStandingDetails;
	}

	public void setFootballService(FootballAppService footballService) {
		this.footballService = footballService;
	}

}
