package _06_overloading;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane pain = new LeagueOptionPane();
		pain.showMessageDialog("lol");
		pain.showMessageDialog("lol", "totle");
		pain.showMessageDialog("lol", "totle", "leagueDark.png");
	}
}
