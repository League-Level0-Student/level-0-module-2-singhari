package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class chicken_caeser_salad {
	public static void main(String[] args) {
	String ed = "How old are you in years?";
	String age =	JOptionPane.showInputDialog(null,ed);
	int ageInt = Integer.parseInt(age);
	if(ageInt >= 18) {
		String edwe = "Who do you think should be president?";
		JOptionPane.showInputDialog(null,edwe);
	}
	else {
		String edwe = "No one cares";
		JOptionPane.showMessageDialog(null,edwe);
		
	}
	
	}
}
