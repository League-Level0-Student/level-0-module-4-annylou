package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class test {
public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog("what is your test score");
	double message = Double.parseDouble(score);	
	
	if(message >= 90) {
		JOptionPane.showMessageDialog(null, "1");
	}
	else if(message >= 50) {
		JOptionPane.showMessageDialog(null, "2");
	}
	else if(message <= 49) {
		JOptionPane.showMessageDialog(null, "3");
	}
	
	
	
	
	
	
	}
}
