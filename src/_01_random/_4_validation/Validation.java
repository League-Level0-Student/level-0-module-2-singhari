//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		
		for(int x=0; x < 10; x++) {
			Random randomMaker = new Random();
			
			int randomNumber = randomMaker.nextInt(5);
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber == 0) {
String r = "You're helping bring the evitable heat death.";
System.out.println(r);
}
else if (randomNumber ==1) {
	String r = "idiot";
	System.out.println(r);
}
else if (randomNumber ==2) {
	String r = "You would look for the corner of a sphere.";
	System.out.println(r);
}
else if (randomNumber ==3) {
	String r = "your mom";
	System.out.println(r);
}
else if (randomNumber ==4) {
	String r = "You have two braincells left and they're fighting for 3rd place.";
	System.out.println(r);
}
else if (randomNumber ==5) {
	String r = "You think the V in Rome in the letter.";
	System.out.println(r);
}
		// 2. Repeat all the code above 10 times
		}
		// 3. Find someone to test out your program. They will like it :)
	}
}
