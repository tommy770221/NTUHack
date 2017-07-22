package com.ntuhackathon.ubike.model.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsesItem{

	@JsonProperty("fullTextAnnotation")
	private FullTextAnnotation fullTextAnnotation;

	@JsonProperty("textAnnotations")
	private List<TextAnnotationsItem> textAnnotations;

	public void setFullTextAnnotation(FullTextAnnotation fullTextAnnotation){
		this.fullTextAnnotation = fullTextAnnotation;
	}

	public FullTextAnnotation getFullTextAnnotation(){
		return fullTextAnnotation;
	}

	public void setTextAnnotations(List<TextAnnotationsItem> textAnnotations){
		this.textAnnotations = textAnnotations;
	}

	public List<TextAnnotationsItem> getTextAnnotations(){
		return textAnnotations;
	}

	@Override
 	public String toString(){
		return 
			"ResponsesItem{" + 
			"fullTextAnnotation = '" + fullTextAnnotation + '\'' + 
			",textAnnotations = '" + textAnnotations + '\'' + 
			"}";
		}
}