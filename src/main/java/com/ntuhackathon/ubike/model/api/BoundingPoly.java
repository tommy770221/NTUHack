package com.ntuhackathon.ubike.model.api;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class BoundingPoly{

	@JsonProperty("vertices")
	private List<VerticesItem> vertices;

	public void setVertices(List<VerticesItem> vertices){
		this.vertices = vertices;
	}

	public List<VerticesItem> getVertices(){
		return vertices;
	}

	@Override
 	public String toString(){
		return 
			"BoundingPoly{" + 
			"vertices = '" + vertices + '\'' + 
			"}";
		}
}