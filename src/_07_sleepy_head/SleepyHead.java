package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		/*
		 * Ask the user for these values using a confirm dialog like the one below
		 * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int i = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		
		int i1 = JOptionPane.showConfirmDialog(null, "Is it a vacation.?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		isWeekday = i==0;
		isVacation = i1==0;

		
		if (isVacation&&isWeekday) {
			JOptionPane.showMessageDialog(null, "SLEEP IN LAZYBONES");

		}
		else if(!isVacation&&isWeekday) {
			JOptionPane.showMessageDialog(null, "get up, LAZYBONES");
		}
		else if (isVacation&&!isWeekday) {
			JOptionPane.showMessageDialog(null, "SLEEP IN LAZYBONES");
		}
		else if(!isVacation&&!isWeekday) {
			JOptionPane.showMessageDialog(null, "SLEEP IN LAZYBONES");
		}
		/*
		 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
		 * in�?.
		 */
	}
}
