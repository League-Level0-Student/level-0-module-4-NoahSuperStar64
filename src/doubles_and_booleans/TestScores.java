package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String Score = JOptionPane.showInputDialog("What's your test score? No lying!");
double Scores = Double.parseDouble(Score);
if(Scores<3.0) {
	JOptionPane.showMessageDialog(null, "Did you even know what the questions meant?");
}
else if(Scores<8.0&&Scores>3.1) {
	JOptionPane.showMessageDialog(null, "Yeah no one cares");
}
else if(Scores>8.1) {
	JOptionPane.showMessageDialog(null, "Oh wow you're SOO smart get out of my house");
}
}
}
