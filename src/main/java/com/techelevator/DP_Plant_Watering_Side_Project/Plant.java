package com.techelevator.DP_Plant_Watering_Side_Project;

public class Plant {
	//Instance Variables
	private int lastWatered; //How many days it's been since last watered
	private int frequency;
	private int daysToWater;
	private boolean isDry;
	private String type;

	public boolean isDry() {
		return isDry;
	}
	//Getters and Setters
	public int getLastWatered() {
		return lastWatered;
	}
	public void setLastWatered(int lastWatered) {
		this.lastWatered = lastWatered;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	public int getDaysToWater(int frequency, int lastWatered) {
		daysToWater = frequency - lastWatered; 
		return daysToWater;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//Constructor
	public Plant (String type) {
		this.type = type;
	}
	
	//Methods
	public int getFrequencyByType(String type) {
		int frequency = 0;
		if (type.equalsIgnoreCase("Spider Plant")) {
			frequency = 7;
		}
		else if (type.equalsIgnoreCase("Fiddle Leaf Fig") || type.equalsIgnoreCase("Pothos")) {
			frequency = 12;
		}
		else if (type.equalsIgnoreCase("Snake Plant")) {
			frequency = 19;
		}
		return frequency;
	}
	
	public void getFunFact (String type) {
		if (type.equalsIgnoreCase("Spider Plant")) {
			System.out.println("\nFun Fact: Spider plants are great indoor air cleaners and 15 spider plants would "
					+ "purify the air of an average sized house.");
		}
		else if (type.equalsIgnoreCase("Fiddle Leaf Fig")) {
			System.out.println("\nFun Fact: Grown outdoors, the fiddle leaf fig can grow up to 49 feet in height, "
					+ "while indoors it can reach heights of around 9 feet.");
		}
		else if (type.equalsIgnoreCase("Pothos")) {
			System.out.println("\nFun Fact: If Pothos that have variegated leaves (leaves with bright streaks),"
					+ "the streaks will grow in abundance while the plant is exposed to sun.\n"
					+ "If the plant has less sun, the streaks will fade to a deep green");
		}
		else if (type.equalsIgnoreCase("Snake Plant")) {
			System.out.println("\nFun Fact: Beyond its scientific name and “bedroom” nickname, "
					+ "the snake plant is also known as Mother-in-Law’s Tongue, Devil’s Tongue,\n Bowstring Hemp, "
					+ "and variations of the Good Luck or Lucky Plant.");
		}
	}
	
	public int isWinter() {
		int newFrequency = frequency + 7;
		return newFrequency;
	}
	
	public void checkIsDry(String isDry, String type, int lastWatered) {
			int daysTo = getDaysToWater(getFrequencyByType(type), lastWatered);
			if (isDry.equalsIgnoreCase("yes") || (isDry.equalsIgnoreCase("Y"))) {				//if dry, tell user to water and end the program
				//spider.checkSoil(true, daysSinceWatered);
				System.out.println("\nTime to Water!");
				//spider.spiderPlantFunFact();
			}
			else if (isDry.equals("no") || (isDry.equalsIgnoreCase("N") && (daysTo > 0) && (daysTo < getFrequencyByType(type)))) {
				//spider.checkSoil(false, daysSinceWatered); //if not dry, check back when it's time to water
				System.out.println("\nCheck back again in " + daysTo + " days.");
				//spider.spiderPlantFunFact();
			}
			else {
				System.out.println("\nCheck back again in a few days.");
			}
			getFunFact(type);
	}
}
