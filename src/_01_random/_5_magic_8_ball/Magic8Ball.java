//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
	// 2. Get the user to enter a question for the 8 ball to answer
		String cool = "Enter a yes or no question.";
		JOptionPane.showInputDialog(null,cool);

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(3)+0;
	
	// 4. If the random number is 0
if (randomNumber ==0) {
	String er = "Yes";
	JOptionPane.showMessageDialog(null,er);
}
	// -- tell the user "Yes"
if (randomNumber == 1) {
	String er = "No";
	JOptionPane.showMessageDialog(null, er);
}
if (randomNumber == 2) {
	String er = "Maybe you ask Google?";
	JOptionPane.showMessageDialog(null, er);
}
	// 5. If the random number is 1
if (randomNumber == 3) {
	String er = "You have no rizz";
	JOptionPane.showMessageDialog(null, er);
}
	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

	}
}
