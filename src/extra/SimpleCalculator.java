package extra;

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
    int Woomy = 0;
		while (Woomy < 1) {
		// 1. Get 2 numbers from the user and convert them to integer.
		String Number1 = JOptionPane.showInputDialog("INPUT FIRST NUMBER VALUE");
		int Num1 = Integer.parseInt(Number1);
		String Number2 = JOptionPane.showInputDialog("INPUT SECOND NUMBER VALUE");
		int Num2 = Integer.parseInt(Number2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "INPUT OPERATION", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "ADDITION", "SUBTRACTION", "MULTIPLICATION", "DIVISION" }, null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate
		// operation.
		if (operation == 0) {
			add(Num1, Num2);
		} else if (operation == 1) {
			subtract(Num1, Num2);
		} else if (operation == 2) {
			multiply(Num1, Num2);
		} else if (operation == 3) {
			divide(Num1, Num2);
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
 Woomy = JOptionPane.showOptionDialog(null, "Keep going?", "Woomy", 0, JOptionPane.INFORMATION_MESSAGE, null, 
		 new String[] {"Yes", "No" }, null);
     }
	}
	// 3. Create method for addition operation.
	// Method should create pop-up that shows equation and solution, eg. 45 + 25 =
	// 70.
	// HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + (num1 + num2));
	}
	// 4. Create similar methods for subtraction, multiplication and division.
	static void subtract(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2));
	}
	static void multiply(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + " x " + num2 + " = " + (num1 * num2));
	}
	static void divide(int num1, int num2) {
		JOptionPane.showMessageDialog(null, num1 + "/" + num2 + " = " + (num1 / num2));
	}
}