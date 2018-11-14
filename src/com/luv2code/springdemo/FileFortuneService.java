package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "fortuneList.txt";
	private List<String> fortuneList;
	
	// create a random number generator
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: inside default constructor");
	}
	
	@PostConstruct
	public void loadFortuneList() {
		
		System.out.println(">> FileFortuneService: inside method loadFortuneList()");
		
		File theFile = new File(fileName);
		
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		
		// initialize the array list
		fortuneList = new ArrayList<String>();
		
		// read fortunes from the file
		try {
			Scanner scanner = new Scanner(theFile);
			
			while (scanner.hasNextLine()) {
				String tempFortune = scanner.nextLine();
				fortuneList.add(tempFortune);
			}
			scanner.close();
		}
		catch (FileNotFoundException eFNF) {
			eFNF.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortuneList.size());
		
		String theFortune = fortuneList.get(index);
		
		return theFortune;
	}

}
