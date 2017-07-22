package com.ntuhackathon.ubike.model.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Property{

	@JsonProperty("detectedLanguages")
	private List<DetectedLanguagesItem> detectedLanguages;

	public void setDetectedLanguages(List<DetectedLanguagesItem> detectedLanguages){
		this.detectedLanguages = detectedLanguages;
	}

	public List<DetectedLanguagesItem> getDetectedLanguages(){
		return detectedLanguages;
	}

	@Override
 	public String toString(){
		return 
			"Property{" + 
			"detectedLanguages = '" + detectedLanguages + '\'' + 
			"}";
		}
}