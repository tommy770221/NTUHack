package com.ntuhackathon.ubike.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class TextAnnotationsItem{

	@JsonProperty("description")
	private String description;

	@JsonProperty("locale")
	private String locale;

	@JsonProperty("boundingPoly")
	private BoundingPoly boundingPoly;

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setLocale(String locale){
		this.locale = locale;
	}

	public String getLocale(){
		return locale;
	}

	public void setBoundingPoly(BoundingPoly boundingPoly){
		this.boundingPoly = boundingPoly;
	}

	public BoundingPoly getBoundingPoly(){
		return boundingPoly;
	}

	@Override
 	public String toString(){
		return 
			"TextAnnotationsItem{" + 
			"description = '" + description + '\'' + 
			",locale = '" + locale + '\'' + 
			",boundingPoly = '" + boundingPoly + '\'' + 
			"}";
		}
}