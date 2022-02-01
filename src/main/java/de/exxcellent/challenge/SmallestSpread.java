package de.exxcellent.challenge;

import java.io.IOException;
import java.util.List;

public class SmallestSpread {
//Eetu Hyvärinen	
	
public String smallestSpread(String filepath, int first, int second) throws IOException {
		
		//get the values from csv file
		CSVReader csvReader = new CSVReader();
		List<String> list = csvReader.readCSVFile(filepath);
		
		//initialize a couple of variables that we need
		String smallestSpread = "";
		double currentSmall = -1;
		
		//loop through each line and split the words at every comma
		for (int i = 1; i<list.size(); i++) {
			String[] array = list.get(i).split(",");
			
			//get the compared values
			double value1 = Double.parseDouble(array[first]);
			double value2 = Double.parseDouble(array[second]);
			
			//swap values if value2 is larger than value1
			if(value1 < value2) {
				double temp = value1;
				value1 = value2;
				value2 = temp;
			}

			//check if smaller than current, or if first iteration and value is -1
			if(Math.abs(value1-value2) < currentSmall || currentSmall < 0) {
				currentSmall = value1-value2;
				smallestSpread = array[0];
			}
		}
		return smallestSpread;
		
 	}
}
