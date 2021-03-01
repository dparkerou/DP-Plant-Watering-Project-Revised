package com.techelevator.plants;

import java.util.Scanner;

import com.techelevator.plants.models.CommonPlant;
import com.techelevator.plants.models.Plant;

public class App {
	
	private static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Step 1 : Intro
		System.out.println("\n*************************************************************************");
		System.out.println("Welcome to the program designed to save hundreds of innocent plant lives!");
		System.out.println("*************************************************************************");
		System.out.println("\nWhat type of Houseplant do you have?");
		System.out.println("[1] Spider Plant");
		System.out.println("[2] Fiddle Leaf Fig");
		System.out.println("[3] Pothos");
		System.out.println("[4] Snake Plant");
		System.out.println("[5] I have no idea");

		// store type of house plant into userChoice
		int userChoice = Integer.parseInt(userInput.nextLine().trim());
		
		if (userChoice > 5 || userChoice < 1) {
			System.out.println ("Invalid choice, please choose again");
		}
		// if the user chooses 5, send them to the website, otherwise continue to when
		// they last watered
		else if (userChoice == 5) {// way to make the text on the new line sit flush with the other line?
			System.out.println(
			"No worries! Check out https://davesgarden.com/guides/pf/ for identification guides and care details.\nIf you discover your plant is listed above, come back and we'll tell you when to water it!");
		} else
			System.out.println("How many days has it been since you last watered your houseplant?");
		
		//store last time watered into daysSinceWatered
		int daysSinceWatered = Integer.parseInt(userInput.nextLine().trim());
		
		//define string to use for type
		String plantType = "";
		switch (userChoice){
		case 1 : 
			plantType = "Spider Plant";
			break;
		case 2 :
			plantType = "Fiddle Leaf Fig";
			break;
		case 3 : 
			plantType = "Pothos";
			break;
		case 4 : 
			plantType = "Snake Plant";
			break;
		}
		
		//Instantiate plant 
		CommonPlant planty = new CommonPlant(plantType);
		int plantFrequency = planty.getFrequencyByType(plantType);
		if (daysSinceWatered > 20 || daysSinceWatered > plantFrequency) {
			System.out.println("You might be overdue for watering, but let's check your plant's soil just to make sure.");
		}
		else if (daysSinceWatered > plantFrequency) {//declare int to hold watering frequency + display frequency 
			System.out.println("You'd normally want to water in " 
					+ planty.getDaysToWater(plantFrequency, daysSinceWatered)
					+ " days, but let's check your plant's soil just to make sure.");
		}
		
		System.out.println("\nStick your forefinger into the soil up to your first knuckle. "
				+ "Is the soil dry for the first inch - inch 1/2? (Y/N)");
		
		String dryOrNah = userInput.nextLine().trim();
		
		planty.checkIsDry(dryOrNah, plantType, daysSinceWatered);
		
		System.out.println("\n*********************************************");
		System.out.println("Thanks for using D's plant watering software!");
		System.out.println("*********************************************");
	}

}
