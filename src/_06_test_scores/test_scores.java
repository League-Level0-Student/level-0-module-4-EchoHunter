package _06_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
	public static void main(String[] args) {
	String score =JOptionPane.showInputDialog("what did you get on your most recent test?");
Double Scoredec =	Double.parseDouble(score);
	if((Scoredec > (80.00))&&(Scoredec <(90.00))) {
		JOptionPane.showMessageDialog(null, "Congrats, you did mediocre!");
	}
	else	if(Scoredec > (90.01)) {
		JOptionPane.showMessageDialog(null, "Congrats, You did MAGNIFICEDMT:JKLFLAKSJDIUGH:OWML:FHP:AJWD:LMC:HEF:OAJLd");
	}
	else if((Scoredec > (69.01))&&(Scoredec < (79.99))) {
		JOptionPane.showMessageDialog(null, "you did meh. :( ");
		
	}
	else if(Scoredec .equals(69.00)) {
		JOptionPane.showMessageDialog(null, "nice ");
	}
	else if (Scoredec < (68.99)) {
		JOptionPane.showMessageDialog(null, "You did terribly, redo kindergarten now!");
		
	}
	
	}
}
