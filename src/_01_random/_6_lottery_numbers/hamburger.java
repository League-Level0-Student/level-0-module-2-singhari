package _01_random._6_lottery_numbers;

import java.util.Random;
import javax.swing.JOptionPane;

public class hamburger {

	public static void main(String[] args) {
		
Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(20)+0;
		int rand = randomMaker.nextInt(20)+0;
		int ran = randomMaker.nextInt(20)+0;
		int snake = randomMaker.nextInt(20)+0;
		int tr = randomMaker.nextInt(20)+0;
		int rain = randomMaker.nextInt(20)+0;
	
		String er = randomNumber+", "+rand+", "+ran+", "+snake+", "+tr+", "+rain;
		JOptionPane.showMessageDialog(null,er);	
		
		
	}
	
	
}
