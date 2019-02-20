package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String Nickel = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int Nickelback = Integer.parseInt(Nickel);
		// Ask the user how many dimes they have, and convert their answer
String Dime = JOptionPane.showInputDialog("How many dimes do you have?");
int TimeToDime = Integer.parseInt(Dime);
		// Ask the user how many quarters they have, and convert their answer
String Quarter = JOptionPane.showInputDialog("How many quarters do you have?");
int Quarterback = Integer.parseInt(Quarter);
		// Calculate how much money the user has and save it in a double variable 
Nickelback=Nickelback*5;
TimeToDime=TimeToDime*10;
Quarterback=Quarterback*25;
double Money = (TimeToDime+Quarterback+Nickelback)/100.0;
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have "+Money+"$");

	}
}

