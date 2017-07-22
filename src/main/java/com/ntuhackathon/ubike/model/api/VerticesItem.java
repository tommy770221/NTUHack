package com.ntuhackathon.ubike.model.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class VerticesItem{

	@JsonProperty("x")
	private int X;

	@JsonProperty("y")
	private int Y;

	public void setX(int X){
		this.X = X;
	}

	public int getX(){
		return X;
	}

	public void setY(int Y){
		this.Y = Y;
	}

	public int getY(){
		return Y;
	}

	@Override
 	public String toString(){
		return 
			"VerticesItem{" + 
			"x = '" + X + '\'' + 
			",y = '" + Y + '\'' + 
			"}";
		}
}