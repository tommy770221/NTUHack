package com.ntuhackathon.ubike.model.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TextResponse{

	@JsonProperty("responses")
	private List<ResponsesItem> responses;

	public void setResponses(List<ResponsesItem> responses){
		this.responses = responses;
	}

	public List<ResponsesItem> getResponses(){
		return responses;
	}

	@Override
 	public String toString(){
		return 
			"TextResponse{" + 
			"responses = '" + responses + '\'' + 
			"}";
		}
}