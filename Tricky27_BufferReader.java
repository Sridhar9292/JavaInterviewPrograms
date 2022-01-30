package com.tricky;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tricky27_BufferReader {

	public static void main(String[] args) throws FileNotFoundException {

		// The constructor BufferedReader(String) is undefined
		// BufferedReader inputStream = new BufferedReader("file.txt");

		// The constructor BufferedReader(FileInputStream) is undefined
		// BufferedReader inputStream = new BufferedReader(new FileInputStream("File.txt"));

		// The constructor BufferedReader(File) is undefined
		// BufferedReader inputStream = new BufferedReader(new File("File.txt"));
		
		BufferedReader inputStream = new BufferedReader(new FileReader("File.txt"));
	}

}
