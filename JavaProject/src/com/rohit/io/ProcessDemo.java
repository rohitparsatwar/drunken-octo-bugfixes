package com.rohit.io;

public class ProcessDemo {

	   public static void main(String[] args) {
	      try {
	         // create a new process
	         System.out.println("Creating Process...");
	         Process p = Runtime.getRuntime().exec("notepad.exe");

	         // cause this process to stop until process p is terminated
	         p.waitFor();

	         // when you manually close notepad.exe program will continue here
	         System.out.println("Waiting over.");

	      } catch (Exception ex) {
	         ex.printStackTrace();
	      }

	   }
	}
