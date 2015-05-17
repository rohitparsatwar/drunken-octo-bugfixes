package com.rohit.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ScanXan {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("D:\\xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }

	}

}
