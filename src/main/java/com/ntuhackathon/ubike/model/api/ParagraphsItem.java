package com.ntuhackathon.ubike.model.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ParagraphsItem{

	@JsonProperty("boundingBox")
	private BoundingBox boundingBox;

	@JsonProperty("property")
	private Property property;

	@JsonProperty("words")
	private List<WordsItem> words;

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

	public void setWords(List<WordsItem> words){
		this.words = words;
	}

	public List<WordsItem> getWords(){
		return words;
	}

	@Override
 	public String toString(){
		return 
			"ParagraphsItem{" + 
			"boundingBox = '" + boundingBox + '\'' + 
			",property = '" + property + '\'' + 
			",words = '" + words + '\'' + 
			"}";
		}
}