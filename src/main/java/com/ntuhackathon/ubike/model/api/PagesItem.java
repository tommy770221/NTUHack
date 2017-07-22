package com.ntuhackathon.ubike.model.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class PagesItem{

	@JsonProperty("blocks")
	private List<BlocksItem> blocks;

	@JsonProperty("property")
	private Property property;

	@JsonProperty("width")
	private int width;

	@JsonProperty("height")
	private int height;

	public void setBlocks(List<BlocksItem> blocks){
		this.blocks = blocks;
	}

	public List<BlocksItem> getBlocks(){
		return blocks;
	}

	public void setProperty(Property property){
		this.property = property;
	}

	public Property getProperty(){
		return property;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}

	@Override
 	public String toString(){
		return 
			"PagesItem{" + 
			"blocks = '" + blocks + '\'' + 
			",property = '" + property + '\'' + 
			",width = '" + width + '\'' + 
			",height = '" + height + '\'' + 
			"}";
		}
}