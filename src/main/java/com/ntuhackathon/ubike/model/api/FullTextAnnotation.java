package com.ntuhackathon.ubike.model.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class FullTextAnnotation{

	@JsonProperty("pages")
	private List<PagesItem> pages;

	@JsonProperty("text")
	private String text;

	public void setPages(List<PagesItem> pages){
		this.pages = pages;
	}

	public List<PagesItem> getPages(){
		return pages;
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
			"FullTextAnnotation{" + 
			"pages = '" + pages + '\'' + 
			",text = '" + text + '\'' + 
			"}";
		}
}