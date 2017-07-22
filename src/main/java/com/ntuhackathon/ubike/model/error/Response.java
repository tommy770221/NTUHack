package com.ntuhackathon.ubike.model.error;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@JsonProperty("car")
	private Object car;

	@JsonProperty("name")
	private String name;

	@JsonProperty("age")
	private int age;

	public void setCar(Object car){
		this.car = car;
	}

	public Object getCar(){
		return car;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"car = '" + car + '\'' + 
			",name = '" + name + '\'' + 
			",age = '" + age + '\'' + 
			"}";
		}
}