package com.techelevator.plants.models;

import java.util.List;


public interface PlantDOA {
	public List<Plant> getAllMyPlants();
	
	List<Plant> searchByName(String plantNickname);
	
	public List<Plant> getPlantsByType(String plantType);
	
	public List<Plant> getPlantsWithoutNicknames();
	
	public void changeNickname(String plantNickname);
	
	public void changeType(String plantType);
	
	public void changeLocation(String plantLocation);
	
	public Plant createPlant(Plant newPlant);

}
