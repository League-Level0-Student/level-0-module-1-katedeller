import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args)

	{

		// 1. Make a variable to hold the score
		int x = 10;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("what gets wetter and wetter the more it dries?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer.equals("a towel")) {
			JOptionPane.showInputDialog("correct");
			// 5. Otherwise, say "wrong" and tell them the answer
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
			// 6. Add some more riddles
			answer = JOptionPane.showInputDialog("what kind of tree can you hold in your hand?");
		}
		if (answer.equals("a palm")) {
			JOptionPane.showInputDialog("correct");
		} else {
			JOptionPane.showMessageDialog(null, "wrong");
			// 2. Make a pop up to show the score.
			JOptionPane.showInputDialog("Score=30");
		}
	}
}
