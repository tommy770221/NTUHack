package com.ntuhackathon.ubike.model.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class WordsItem{

	@JsonProperty("boundingBox")
	private BoundingBox boundingBox;

	@JsonProperty("property")
	private Property property;

	@JsonProperty("symbols")
	private List<SymbolsItem> symbols;

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

	public void setSymbols(List<SymbolsItem> symbols){
		this.symbols = symbols;
	}

	public List<SymbolsItem> getSymbols(){
		return symbols;
	}

	@Override
 	public String toString(){
		return 
			"WordsItem{" + 
			"boundingBox = '" + boundingBox + '\'' + 
			",property = '" + property + '\'' + 
			",symbols = '" + symbols + '\'' + 
			"}";
		}
}