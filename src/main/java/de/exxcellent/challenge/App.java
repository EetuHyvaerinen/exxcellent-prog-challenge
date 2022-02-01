package de.exxcellent.challenge;

import java.io.IOException;


/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

	/**
	 * This is the main entry method of your program.
	 * @param args The CLI arguments passed
	 */
	public static void main(String... args) {

		// Your preparation code …
		
		//create an instance of class SmallestSpread
		SmallestSpread spread = new SmallestSpread();
		
		try {
			String dayWithSmallestTempSpread = spread.smallestSpread("C:\\Users\\Eetu\\Desktop\\progchallenge\\programming-challenge\\src\\main\\resources\\de\\exxcellent\\challenge\\weather.csv", 1, 2);
			// Your day analysis function call …
			System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

			String teamWithSmallestGoalSpread = spread.smallestSpread("C:\\Users\\Eetu\\Desktop\\progchallenge\\programming-challenge\\src\\main\\resources\\de\\exxcellent\\challenge\\football.csv", 5, 6); 
			// Your goal analysis function call …
			System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
		} catch (IOException e) {
			System.out.println("There was an IOException");
			e.printStackTrace();
		}
	}
}