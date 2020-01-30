
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
    "country_id",
    "country_name",
    "league_id",
    "league_name"
})
public class League {

    @JsonProperty("country_id")
    private String countryId;
    @JsonProperty("country_name")
    private String countryName;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("league_name")
    private String leagueName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("country_id")
    public String getCountryId() {
        return countryId;
    }

    @JsonProperty("country_id")
    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
