package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String gryffin = "He is a Black Belt";
		String joe = "They are Joe mama";
		String billnye = "Is the science guy";
		String no = "Yes";
		String mochi = "He's the all mighty lord and savior, salvation for the moch legion, ruler of the world, and lies on tables";
		String yes = "No";
		String red_crewmate = "WHEN THE IMPOSTER IS SUS: TU TU TU, DU";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String name = JOptionPane.showInputDialog("Enter a name, now!");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		if (name.equals("Gryffin")) {
			JOptionPane.showMessageDialog(null, gryffin);
		}if (name.equals("Joe")) {
			JOptionPane.showMessageDialog(null, joe);
		}if (name.equals("Bill Nye")) {
			JOptionPane.showMessageDialog(null, billnye);
		
		}if (name.equals("No")) {
			JOptionPane.showMessageDialog(null, no);
		}if (name.equals("Mochi")) {
			JOptionPane.showMessageDialog(null, mochi);
		}if (name.equals("Yes")) {
			JOptionPane.showMessageDialog(null, yes);
		}if (name.equals("Red Crewmate")) {
			JOptionPane.showMessageDialog(null, red_crewmate);
		}
	}
}

