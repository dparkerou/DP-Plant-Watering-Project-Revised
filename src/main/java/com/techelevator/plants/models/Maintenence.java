package com.techelevator.plants.models;

import java.time.LocalDate;

public class Maintenence {
	
	private Long maintenence_id;
	private int plant_id;
	private String maintenence_type;
	private LocalDate date_completed;
	
	
	public Long getMaintenence_id() {
		return maintenence_id;
	}
	public void setMaintenence_id(Long maintenence_id) {
		this.maintenence_id = maintenence_id;
	}
	public int getPlant_id() {
		return plant_id;
	}
	public void setPlant_id(int plant_id) {
		this.plant_id = plant_id;
	}
	public String getMaintenence_type() {
		return maintenence_type;
	}
	public void setMaintenence_type(String maintenence_type) {
		this.maintenence_type = maintenence_type;
	}
	public LocalDate getDate_completed() {
		return date_completed;
	}
	public void setDate_completed(LocalDate date_completed) {
		this.date_completed = date_completed;
	}
	
	@Override
	public String toString() {
		return "Plant ID: " + plant_id + " - Maintenence Type: " + maintenence_type + " - Date Completed: " + date_completed;
	} 
	
	
	
	
	
	
	
	
	
	
	
}
