package com.ntuhackathon.ubike.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class DetectedLanguagesItem{

	@JsonProperty("languageCode")
	private String languageCode;

	public void setLanguageCode(String languageCode){
		this.languageCode = languageCode;
	}

	public String getLanguageCode(){
		return languageCode;
	}

	@Override
 	public String toString(){
		return 
			"DetectedLanguagesItem{" + 
			"languageCode = '" + languageCode + '\'' + 
			"}";
		}
}