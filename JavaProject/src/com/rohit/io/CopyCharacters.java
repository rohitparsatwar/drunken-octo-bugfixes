package com.rohit.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {

	public static void main(String[] args) throws IOException {
		BufferedReader inputStream = null;
		BufferedWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader("D:\\xanadu.txt"));
			outputStream = new BufferedWriter(new FileWriter("D:\\characteroutput.txt"));

			int c;
			while ((c = inputStream.read()) != -1) {
				System.out.println("------------------- "+c);
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
		}

	}

}
