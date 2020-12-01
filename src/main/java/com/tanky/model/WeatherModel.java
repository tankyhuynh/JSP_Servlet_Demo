package com.tanky.model;

public class WeatherModel {

	private int id;
	private String name;
	private int cod;
	
	public WeatherModel() {
		// TODO Auto-generated constructor stub
	}
	
	public WeatherModel(int id, String name, int cod) {
		super();
		this.id = id;
		this.name = name;
		this.cod = cod;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	
	
	
	
	
}
