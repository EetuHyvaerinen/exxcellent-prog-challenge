package de.exxcellent.challenge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
//Eetu Hyvärinen
	
	//takes a csv file and separates it into a List of Strings
	public List<String> readCSVFile(String filePath) throws IOException, FileNotFoundException {
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		List<String> lines = new ArrayList<>();
		String newLine = null;
		
		//go through each line of the file and add it to the List
		while ((newLine = reader.readLine()) != null) {
		    lines.add(newLine);
		}
		
		//at the end, close the reader and return the List
		reader.close();
		return lines;
	}
}
