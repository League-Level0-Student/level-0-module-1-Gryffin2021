package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String innput = JOptionPane.showInputDialog("There are 4 remaining crewmates on The Skeld. "
					+ "The crew were in each of the named locations and Black dies in cafeteria; "
					+ "Pink in electrical: I was doing wires! Blue in admin: "
					+ "I was doing card swipe! "
					+ "and Red in asteroids: I was commiting murder! Who killed Black?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if(innput.equals("The Imposter")) {
		// 5. Otherwise, say "wrong" and tell them the answer
				JOptionPane.showMessageDialog(null,"CORRECT!");
				score++;
			}
		// 6. Add some more riddles
			else {
		// 2. Make a pop up to show the score.
				JOptionPane.showMessageDialog(null,"No you idiot, it was The Imposter! Player was killed in meeting");
			
			}
			String innnput = JOptionPane.showInputDialog("A one story low budget house is all yellow. The toilet is yellow. The dog is yellow. The floor is yellow. What color is the idiot who bought it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			if(innnput.equals("Not yellow")) {
		// 5. Otherwise, say "wrong" and tell them the answer
				JOptionPane.showMessageDialog(null,"CORRECT!");
				score++;
			}
		// 6. Add some more riddles
			else {
		// 2. Make a pop up to show the score.
				JOptionPane.showMessageDialog(null,"No, they were not yellow!");
			
			JOptionPane.showMessageDialog(null,"Score = "+ score);
	}
	
}

