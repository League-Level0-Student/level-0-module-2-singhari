package _03_string_conversion._2_strings_cannot_add;

import javax.swing.JOptionPane;

public class StringsCannotAdd {

		// 1) Make a main method that includes all the steps below…. 
	public static void main(String[] args) {
		String cool = "Enter the number 4.";
	String fourAsString = JOptionPane.showInputDialog(null,cool);
	String ed = "Enter the number 6.";
	String sixAsString =	JOptionPane.showInputDialog(null,ed);
	String er = fourAsString+sixAsString;
	JOptionPane.showMessageDialog(null,er);
	String we = "Enter the number 5.";
	String fiveAsString =	JOptionPane.showInputDialog(null,we);
	String der = fourAsString+fiveAsString+sixAsString;
	JOptionPane.showMessageDialog(null,der);
	int fourAsInt = Integer.parseInt(fourAsString);
	int fiveAsInt = Integer.parseInt(fiveAsString);
	int sixAsInt = Integer.parseInt(sixAsString);
	int r = fourAsInt+sixAsInt+fiveAsInt;
	JOptionPane.showMessageDialog(null,r);
	
	}
			// 2) Ask the user to enter number 4 and hold it in the variable fourAsString 
			
			// 3) Ask the user to enter number 6 and hold it in the variable sixAsString 
			
			// 4) Print the addition of fourAsString and sixAsString using JOptionPane 
			
			// Did you notice 46 instead of 4 + 6 = 10?
			
			// 5) Ask the user to enter number 5 and hold it in the variable fiveAsString 
			
			// 6) Print the addition of the variables fourAsString, sixAsString, and fiveAsString 
			
			//Did you notice 456 instead of 4 + 6 + 5 = 15?
			
			// Insert fourAsString inside the parenthesis of Integer.parseInt() and set the method equal to fourAsInt
			// Hint: int fourAsInt = Integer.parseInt(fourAsString);
			
			// 7) Do the same for sixAsString. 
			
			// 8) Print the addition of fourAsInt and sixAsInt using JOptionPane 
			
			// Did you notice the value 10? If so, hurray! You just changed the type of your variable from String to int.
			
			// 9) Convert fiveAsString to fiveAsInt using Integer.parseInt();  
			
			// 10) Print the addition of fourAsInt, sixAsInt, and fiveAsInt using JOptionPane 
			
			// Is your value now 15 instead of 465?
}
