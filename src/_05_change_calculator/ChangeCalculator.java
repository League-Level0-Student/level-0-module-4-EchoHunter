package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have

		String nickel = JOptionPane.showInputDialog(null, "how many nickels do you have?");

		int nickelInt = Integer.parseInt(nickel);
		// Ask the user how many dimes they have, and convert their answer
		String dime = JOptionPane.showInputDialog(null, "how many dimes do you have?");

		int dimeInt = Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
		String quarter = JOptionPane.showInputDialog(null, "how many quarters do you have?");

		int quarterInt = Integer.parseInt(quarter);
		// Calculate how much money the user has and save it in a double variable
		quarterInt = quarterInt * 25;
		dimeInt = dimeInt * 10;
		nickelInt = nickelInt * 5;

		int money = quarterInt + dimeInt + nickelInt;
		double dollar = money/100.0;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "you have $" + dollar );
	}
}
