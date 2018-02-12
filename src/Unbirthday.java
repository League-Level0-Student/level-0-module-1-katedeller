import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {

		String answer = JOptionPane.showInputDialog("What is your brithday?");
		if (answer.equals("2/11")) {
			JOptionPane.showInputDialog("Happy birthday!");
		} else {
			JOptionPane.showInputDialog("Merry unbirthday"); // do this instead}

		}
	}
}
