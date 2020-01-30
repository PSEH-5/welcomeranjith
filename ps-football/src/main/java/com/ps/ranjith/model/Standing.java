
package com.ps.ranjith.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "country_name",
    "league_id",
    "league_name",
    "team_name",
    "overall_league_position",
    "overall_league_payed",
    "overall_league_W",
    "overall_league_D",
    "overall_league_L",
    "overall_league_GF",
    "overall_league_GA",
    "overall_league_PTS",
    "home_league_position",
    "home_league_payed",
    "home_league_W",
    "home_league_D",
    "home_league_L",
    "home_league_GF",
    "home_league_GA",
    "home_league_PTS",
    "away_league_position",
    "away_league_payed",
    "away_league_W",
    "away_league_D",
    "away_league_L",
    "away_league_GF",
    "away_league_GA",
    "away_league_PTS"
})
public class Standing {

    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("league_name")
    private String leagueName;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("overall_league_position")
    private String overallLeaguePosition;
    @JsonProperty("overall_league_payed")
    private String overallLeaguePayed;
    @JsonProperty("overall_league_W")
    private String overallLeagueW;
    @JsonProperty("overall_league_D")
    private String overallLeagueD;
    @JsonProperty("overall_league_L")
    private String overallLeagueL;
    @JsonProperty("overall_league_GF")
    private String overallLeagueGF;
    @JsonProperty("overall_league_GA")
    private String overallLeagueGA;
    @JsonProperty("overall_league_PTS")
    private String overallLeaguePTS;
    @JsonProperty("home_league_position")
    private String homeLeaguePosition;
    @JsonProperty("home_league_payed")
    private String homeLeaguePayed;
    @JsonProperty("home_league_W")
    private String homeLeagueW;
    @JsonProperty("home_league_D")
    private String homeLeagueD;
    @JsonProperty("home_league_L")
    private String homeLeagueL;
    @JsonProperty("home_league_GF")
    private String homeLeagueGF;
    @JsonProperty("home_league_GA")
    private String homeLeagueGA;
    @JsonProperty("home_league_PTS")
    private String homeLeaguePTS;
    @JsonProperty("away_league_position")
    private String awayLeaguePosition;
    @JsonProperty("away_league_payed")
    private String awayLeaguePayed;
    @JsonProperty("away_league_W")
    private String awayLeagueW;
    @JsonProperty("away_league_D")
    private String awayLeagueD;
    @JsonProperty("away_league_L")
    private String awayLeagueL;
    @JsonProperty("away_league_GF")
    private String awayLeagueGF;
    @JsonProperty("away_league_GA")
    private String awayLeagueGA;
    @JsonProperty("away_league_PTS")
    private String awayLeaguePTS;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("country_name")
    public String getCountryName() {
        return countryName;
    }

    @JsonProperty("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @JsonProperty("league_id")
    public String getLeagueId() {
        return leagueId;
    }

    @JsonProperty("league_id")
    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    @JsonProperty("league_name")
    public String getLeagueName() {
        return leagueName;
    }

    @JsonProperty("league_name")
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    @JsonProperty("team_name")
    public String getTeamName() {
        return teamName;
    }

    @JsonProperty("team_name")
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @JsonProperty("overall_league_position")
    public String getOverallLeaguePosition() {
        return overallLeaguePosition;
    }

    @JsonProperty("overall_league_position")
    public void setOverallLeaguePosition(String overallLeaguePosition) {
        this.overallLeaguePosition = overallLeaguePosition;
    }

    @JsonProperty("overall_league_payed")
    public String getOverallLeaguePayed() {
        return overallLeaguePayed;
    }

    @JsonProperty("overall_league_payed")
    public void setOverallLeaguePayed(String overallLeaguePayed) {
        this.overallLeaguePayed = overallLeaguePayed;
    }

    @JsonProperty("overall_league_W")
    public String getOverallLeagueW() {
        return overallLeagueW;
    }

    @JsonProperty("overall_league_W")
    public void setOverallLeagueW(String overallLeagueW) {
        this.overallLeagueW = overallLeagueW;
    }

    @JsonProperty("overall_league_D")
    public String getOverallLeagueD() {
        return overallLeagueD;
    }

    @JsonProperty("overall_league_D")
    public void setOverallLeagueD(String overallLeagueD) {
        this.overallLeagueD = overallLeagueD;
    }

    @JsonProperty("overall_league_L")
    public String getOverallLeagueL() {
        return overallLeagueL;
    }

    @JsonProperty("overall_league_L")
    public void setOverallLeagueL(String overallLeagueL) {
        this.overallLeagueL = overallLeagueL;
    }

    @JsonProperty("overall_league_GF")
    public String getOverallLeagueGF() {
        return overallLeagueGF;
    }

    @JsonProperty("overall_league_GF")
    public void setOverallLeagueGF(String overallLeagueGF) {
        this.overallLeagueGF = overallLeagueGF;
    }

    @JsonProperty("overall_league_GA")
    public String getOverallLeagueGA() {
        return overallLeagueGA;
    }

    @JsonProperty("overall_league_GA")
    public void setOverallLeagueGA(String overallLeagueGA) {
        this.overallLeagueGA = overallLeagueGA;
    }

    @JsonProperty("overall_league_PTS")
    public String getOverallLeaguePTS() {
        return overallLeaguePTS;
    }

    @JsonProperty("overall_league_PTS")
    public void setOverallLeaguePTS(String overallLeaguePTS) {
        this.overallLeaguePTS = overallLeaguePTS;
    }

    @JsonProperty("home_league_position")
    public String getHomeLeaguePosition() {
        return homeLeaguePosition;
    }

    @JsonProperty("home_league_position")
    public void setHomeLeaguePosition(String homeLeaguePosition) {
        this.homeLeaguePosition = homeLeaguePosition;
    }

    @JsonProperty("home_league_payed")
    public String getHomeLeaguePayed() {
        return homeLeaguePayed;
    }

    @JsonProperty("home_league_payed")
    public void setHomeLeaguePayed(String homeLeaguePayed) {
        this.homeLeaguePayed = homeLeaguePayed;
    }

    @JsonProperty("home_league_W")
    public String getHomeLeagueW() {
        return homeLeagueW;
    }

    @JsonProperty("home_league_W")
    public void setHomeLeagueW(String homeLeagueW) {
        this.homeLeagueW = homeLeagueW;
    }

    @JsonProperty("home_league_D")
    public String getHomeLeagueD() {
        return homeLeagueD;
    }

    @JsonProperty("home_league_D")
    public void setHomeLeagueD(String homeLeagueD) {
        this.homeLeagueD = homeLeagueD;
    }

    @JsonProperty("home_league_L")
    public String getHomeLeagueL() {
        return homeLeagueL;
    }

    @JsonProperty("home_league_L")
    public void setHomeLeagueL(String homeLeagueL) {
        this.homeLeagueL = homeLeagueL;
    }

    @JsonProperty("home_league_GF")
    public String getHomeLeagueGF() {
        return homeLeagueGF;
    }

    @JsonProperty("home_league_GF")
    public void setHomeLeagueGF(String homeLeagueGF) {
        this.homeLeagueGF = homeLeagueGF;
    }

    @JsonProperty("home_league_GA")
    public String getHomeLeagueGA() {
        return homeLeagueGA;
    }

    @JsonProperty("home_league_GA")
    public void setHomeLeagueGA(String homeLeagueGA) {
        this.homeLeagueGA = homeLeagueGA;
    }

    @JsonProperty("home_league_PTS")
    public String getHomeLeaguePTS() {
        return homeLeaguePTS;
    }

    @JsonProperty("home_league_PTS")
    public void setHomeLeaguePTS(String homeLeaguePTS) {
        this.homeLeaguePTS = homeLeaguePTS;
    }

    @JsonProperty("away_league_position")
    public String getAwayLeaguePosition() {
        return awayLeaguePosition;
    }

    @JsonProperty("away_league_position")
    public void setAwayLeaguePosition(String awayLeaguePosition) {
        this.awayLeaguePosition = awayLeaguePosition;
    }

    @JsonProperty("away_league_payed")
    public String getAwayLeaguePayed() {
        return awayLeaguePayed;
    }

    @JsonProperty("away_league_payed")
    public void setAwayLeaguePayed(String awayLeaguePayed) {
        this.awayLeaguePayed = awayLeaguePayed;
    }

    @JsonProperty("away_league_W")
    public String getAwayLeagueW() {
        return awayLeagueW;
    }

    @JsonProperty("away_league_W")
    public void setAwayLeagueW(String awayLeagueW) {
        this.awayLeagueW = awayLeagueW;
    }

    @JsonProperty("away_league_D")
    public String getAwayLeagueD() {
        return awayLeagueD;
    }

    @JsonProperty("away_league_D")
    public void setAwayLeagueD(String awayLeagueD) {
        this.awayLeagueD = awayLeagueD;
    }

    @JsonProperty("away_league_L")
    public String getAwayLeagueL() {
        return awayLeagueL;
    }

    @JsonProperty("away_league_L")
    public void setAwayLeagueL(String awayLeagueL) {
        this.awayLeagueL = awayLeagueL;
    }

    @JsonProperty("away_league_GF")
    public String getAwayLeagueGF() {
        return awayLeagueGF;
    }

    @JsonProperty("away_league_GF")
    public void setAwayLeagueGF(String awayLeagueGF) {
        this.awayLeagueGF = awayLeagueGF;
    }

    @JsonProperty("away_league_GA")
    public String getAwayLeagueGA() {
        return awayLeagueGA;
    }

    @JsonProperty("away_league_GA")
    public void setAwayLeagueGA(String awayLeagueGA) {
        this.awayLeagueGA = awayLeagueGA;
    }

    @JsonProperty("away_league_PTS")
    public String getAwayLeaguePTS() {
        return awayLeaguePTS;
    }

    @JsonProperty("away_league_PTS")
    public void setAwayLeaguePTS(String awayLeaguePTS) {
        this.awayLeaguePTS = awayLeaguePTS;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((awayLeagueD == null) ? 0 : awayLeagueD.hashCode());
		result = prime * result + ((awayLeagueGA == null) ? 0 : awayLeagueGA.hashCode());
		result = prime * result + ((awayLeagueGF == null) ? 0 : awayLeagueGF.hashCode());
		result = prime * result + ((awayLeagueL == null) ? 0 : awayLeagueL.hashCode());
		result = prime * result + ((awayLeaguePTS == null) ? 0 : awayLeaguePTS.hashCode());
		result = prime * result + ((awayLeaguePayed == null) ? 0 : awayLeaguePayed.hashCode());
		result = prime * result + ((awayLeaguePosition == null) ? 0 : awayLeaguePosition.hashCode());
		result = prime * result + ((awayLeagueW == null) ? 0 : awayLeagueW.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((homeLeagueD == null) ? 0 : homeLeagueD.hashCode());
		result = prime * result + ((homeLeagueGA == null) ? 0 : homeLeagueGA.hashCode());
		result = prime * result + ((homeLeagueGF == null) ? 0 : homeLeagueGF.hashCode());
		result = prime * result + ((homeLeagueL == null) ? 0 : homeLeagueL.hashCode());
		result = prime * result + ((homeLeaguePTS == null) ? 0 : homeLeaguePTS.hashCode());
		result = prime * result + ((homeLeaguePayed == null) ? 0 : homeLeaguePayed.hashCode());
		result = prime * result + ((homeLeaguePosition == null) ? 0 : homeLeaguePosition.hashCode());
		result = prime * result + ((homeLeagueW == null) ? 0 : homeLeagueW.hashCode());
		result = prime * result + ((leagueId == null) ? 0 : leagueId.hashCode());
		result = prime * result + ((leagueName == null) ? 0 : leagueName.hashCode());
		result = prime * result + ((overallLeagueD == null) ? 0 : overallLeagueD.hashCode());
		result = prime * result + ((overallLeagueGA == null) ? 0 : overallLeagueGA.hashCode());
		result = prime * result + ((overallLeagueGF == null) ? 0 : overallLeagueGF.hashCode());
		result = prime * result + ((overallLeagueL == null) ? 0 : overallLeagueL.hashCode());
		result = prime * result + ((overallLeaguePTS == null) ? 0 : overallLeaguePTS.hashCode());
		result = prime * result + ((overallLeaguePayed == null) ? 0 : overallLeaguePayed.hashCode());
		result = prime * result + ((overallLeaguePosition == null) ? 0 : overallLeaguePosition.hashCode());
		result = prime * result + ((overallLeagueW == null) ? 0 : overallLeagueW.hashCode());
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Standing other = (Standing) obj;
		if (additionalProperties == null) {
			if (other.additionalProperties != null)
				return false;
		} else if (!additionalProperties.equals(other.additionalProperties))
			return false;
		if (awayLeagueD == null) {
			if (other.awayLeagueD != null)
				return false;
		} else if (!awayLeagueD.equals(other.awayLeagueD))
			return false;
		if (awayLeagueGA == null) {
			if (other.awayLeagueGA != null)
				return false;
		} else if (!awayLeagueGA.equals(other.awayLeagueGA))
			return false;
		if (awayLeagueGF == null) {
			if (other.awayLeagueGF != null)
				return false;
		} else if (!awayLeagueGF.equals(other.awayLeagueGF))
			return false;
		if (awayLeagueL == null) {
			if (other.awayLeagueL != null)
				return false;
		} else if (!awayLeagueL.equals(other.awayLeagueL))
			return false;
		if (awayLeaguePTS == null) {
			if (other.awayLeaguePTS != null)
				return false;
		} else if (!awayLeaguePTS.equals(other.awayLeaguePTS))
			return false;
		if (awayLeaguePayed == null) {
			if (other.awayLeaguePayed != null)
				return false;
		} else if (!awayLeaguePayed.equals(other.awayLeaguePayed))
			return false;
		if (awayLeaguePosition == null) {
			if (other.awayLeaguePosition != null)
				return false;
		} else if (!awayLeaguePosition.equals(other.awayLeaguePosition))
			return false;
		if (awayLeagueW == null) {
			if (other.awayLeagueW != null)
				return false;
		} else if (!awayLeagueW.equals(other.awayLeagueW))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (homeLeagueD == null) {
			if (other.homeLeagueD != null)
				return false;
		} else if (!homeLeagueD.equals(other.homeLeagueD))
			return false;
		if (homeLeagueGA == null) {
			if (other.homeLeagueGA != null)
				return false;
		} else if (!homeLeagueGA.equals(other.homeLeagueGA))
			return false;
		if (homeLeagueGF == null) {
			if (other.homeLeagueGF != null)
				return false;
		} else if (!homeLeagueGF.equals(other.homeLeagueGF))
			return false;
		if (homeLeagueL == null) {
			if (other.homeLeagueL != null)
				return false;
		} else if (!homeLeagueL.equals(other.homeLeagueL))
			return false;
		if (homeLeaguePTS == null) {
			if (other.homeLeaguePTS != null)
				return false;
		} else if (!homeLeaguePTS.equals(other.homeLeaguePTS))
			return false;
		if (homeLeaguePayed == null) {
			if (other.homeLeaguePayed != null)
				return false;
		} else if (!homeLeaguePayed.equals(other.homeLeaguePayed))
			return false;
		if (homeLeaguePosition == null) {
			if (other.homeLeaguePosition != null)
				return false;
		} else if (!homeLeaguePosition.equals(other.homeLeaguePosition))
			return false;
		if (homeLeagueW == null) {
			if (other.homeLeagueW != null)
				return false;
		} else if (!homeLeagueW.equals(other.homeLeagueW))
			return false;
		if (leagueId == null) {
			if (other.leagueId != null)
				return false;
		} else if (!leagueId.equals(other.leagueId))
			return false;
		if (leagueName == null) {
			if (other.leagueName != null)
				return false;
		} else if (!leagueName.equals(other.leagueName))
			return false;
		if (overallLeagueD == null) {
			if (other.overallLeagueD != null)
				return false;
		} else if (!overallLeagueD.equals(other.overallLeagueD))
			return false;
		if (overallLeagueGA == null) {
			if (other.overallLeagueGA != null)
				return false;
		} else if (!overallLeagueGA.equals(other.overallLeagueGA))
			return false;
		if (overallLeagueGF == null) {
			if (other.overallLeagueGF != null)
				return false;
		} else if (!overallLeagueGF.equals(other.overallLeagueGF))
			return false;
		if (overallLeagueL == null) {
			if (other.overallLeagueL != null)
				return false;
		} else if (!overallLeagueL.equals(other.overallLeagueL))
			return false;
		if (overallLeaguePTS == null) {
			if (other.overallLeaguePTS != null)
				return false;
		} else if (!overallLeaguePTS.equals(other.overallLeaguePTS))
			return false;
		if (overallLeaguePayed == null) {
			if (other.overallLeaguePayed != null)
				return false;
		} else if (!overallLeaguePayed.equals(other.overallLeaguePayed))
			return false;
		if (overallLeaguePosition == null) {
			if (other.overallLeaguePosition != null)
				return false;
		} else if (!overallLeaguePosition.equals(other.overallLeaguePosition))
			return false;
		if (overallLeagueW == null) {
			if (other.overallLeagueW != null)
				return false;
		} else if (!overallLeagueW.equals(other.overallLeagueW))
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Standing [countryName=" + countryName + ", leagueId=" + leagueId + ", leagueName=" + leagueName
				+ ", teamName=" + teamName + ", overallLeaguePosition=" + overallLeaguePosition
				+ ", overallLeaguePayed=" + overallLeaguePayed + ", overallLeagueW=" + overallLeagueW
				+ ", overallLeagueD=" + overallLeagueD + ", overallLeagueL=" + overallLeagueL + ", overallLeagueGF="
				+ overallLeagueGF + ", overallLeagueGA=" + overallLeagueGA + ", overallLeaguePTS=" + overallLeaguePTS
				+ ", homeLeaguePosition=" + homeLeaguePosition + ", homeLeaguePayed=" + homeLeaguePayed
				+ ", homeLeagueW=" + homeLeagueW + ", homeLeagueD=" + homeLeagueD + ", homeLeagueL=" + homeLeagueL
				+ ", homeLeagueGF=" + homeLeagueGF + ", homeLeagueGA=" + homeLeagueGA + ", homeLeaguePTS="
				+ homeLeaguePTS + ", awayLeaguePosition=" + awayLeaguePosition + ", awayLeaguePayed=" + awayLeaguePayed
				+ ", awayLeagueW=" + awayLeagueW + ", awayLeagueD=" + awayLeagueD + ", awayLeagueL=" + awayLeagueL
				+ ", awayLeagueGF=" + awayLeagueGF + ", awayLeagueGA=" + awayLeagueGA + ", awayLeaguePTS="
				+ awayLeaguePTS + ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("team_id")
	public String getTeamId() {
		return teamId;
	}

	@JsonProperty("team_id")
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

   

}
