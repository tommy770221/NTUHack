package com.ntuhackathon.ubike.model.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class BlocksItem{

	@JsonProperty("boundingBox")
	private BoundingBox boundingBox;

	@JsonProperty("blockType")
	private String blockType;

	@JsonProperty("property")
	private Property property;

	@JsonProperty("paragraphs")
	private List<ParagraphsItem> paragraphs;

	public void setBoundingBox(BoundingBox boundingBox){
		this.boundingBox = boundingBox;
	}

	public BoundingBox getBoundingBox(){
		return boundingBox;
	}

	public void setBlockType(String blockType){
		this.blockType = blockType;
	}

	public String getBlockType(){
		return blockType;
	}

	public void setProperty(Property property){
		this.property = property;
	}

	public Property getProperty(){
		return property;
	}

	public void setParagraphs(List<ParagraphsItem> paragraphs){
		this.paragraphs = paragraphs;
	}

	public List<ParagraphsItem> getParagraphs(){
		return paragraphs;
	}

	@Override
 	public String toString(){
		return 
			"BlocksItem{" + 
			"boundingBox = '" + boundingBox + '\'' + 
			",blockType = '" + blockType + '\'' + 
			",property = '" + property + '\'' + 
			",paragraphs = '" + paragraphs + '\'' + 
			"}";
		}
}