package com.ntuhackathon.ubike.model.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SymbolsItem{

	@JsonProperty("boundingBox")
	private BoundingBox boundingBox;

	@JsonProperty("property")
	private Property property;

	@JsonProperty("text")
	private String text;

	public void setBoundingBox(BoundingBox boundingBox){
		this.boundingBox = boundingBox;
	}

	public BoundingBox getBoundingBox(){
		return boundingBox;
	}

	public void setProperty(Property property){
		this.property = property;
	}

	public Property getProperty(){
		return property;
	}

	public void setText(String text){
		this.text = text;
	}

	public String getText(){
		return text;
	}

	@Override
 	public String toString(){
		return 
			"SymbolsItem{" + 
			"boundingBox = '" + boundingBox + '\'' + 
			",property = '" + property + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}