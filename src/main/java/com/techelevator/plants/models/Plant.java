package com.techelevator.plants.models;

public class Plant {
	
	private Long plant_id;
	
	private String plant_type;
	
	private String plant_nickname;
	
	private String plant_location;
	
	
	

	public Long getPlant_id() {
		return plant_id;
	}

	public void setPlant_id(Long plant_id) {
		this.plant_id = plant_id;
	}

	public String getPlant_type() {
		return plant_type;
	}

	public void setPlant_type(String plant_type) {
		this.plant_type = plant_type;
	}

	public String getPlant_nickname() {
		return plant_nickname;
	}

	public void setPlant_nickname(String plant_nickname) {
		this.plant_nickname = plant_nickname;
	}

	public String getPlant_location() {
		return plant_location;
	}

	public void setPlant_location(String plant_location) {
		this.plant_location = plant_location;
	}

	@Override
	public String toString() {
		return "Plant Type: " + plant_type + " - Nickname: " + plant_nickname + " - Location: " + plant_location;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
