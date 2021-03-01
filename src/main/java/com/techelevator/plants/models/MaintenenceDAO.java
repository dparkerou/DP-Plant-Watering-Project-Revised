package com.techelevator.plants.models;

import java.util.List;

public interface MaintenenceDAO {
	public List<Plant> getLog();
	
	public List<Plant> searchByName(String plantNickname);
	
	public List<Plant> searchByType(String maintenenceType);
	
	public Plant addToLog(Plant newPlant);
	
	public Plant editLog(Plant newPlant);
}
