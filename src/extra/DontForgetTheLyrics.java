package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to guess
	 * the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song. *Check 2.
	 * Click File -> Export Audio, and save your file on the Desktop. *Check 3. Drag
	 * your file from the Desktop into the "default package" under "src".
	 */

	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane.showMessageDialog(null,
				"Welcome to Don't Forget The Lyrics!\n In this game, we play part of a song, and you have to remember the lyrics!\nGot it? Good! Let's go!");
		// 5. Use the playSound method to play your song.
		playSound("PRESSURE.wav");
		// 6. Make a pop-up for the player to type their answer.
		JOptionPane.showMessageDialog(null, "Listen closely...");
		Thread.sleep(000);
		String Answer1 = JOptionPane.showInputDialog("Now... What were the lyrics? No punctuation please.");
		// 7. If they answered correctly, tell them that they were right.
		if (Answer1.equalsIgnoreCase("Pressure pushing down on me pressing down on you no man asked for")) {
			JOptionPane.showMessageDialog(null, "You are absolutely correct! Next question.");
		}
		// 8. Otherwise, tell them they are wrong, and give them the answer.
		else {
			JOptionPane.showMessageDialog(null,
					"Sorry, that is incorrect. The correct answer is:\n Pressure Pushing down on me pressing down on you\nNo man asked for\nNext question.");
		}
		// 9. Record another sound and repeat steps 5-8.
		playSound("FIREFLIES2.wav");
		JOptionPane.showMessageDialog(null, "Listen closely...");
		String Answer2 = JOptionPane.showInputDialog("Now... the lyrics?");
		if(Answer2.equalsIgnoreCase("I'd like to make myself believe that planet earth turns slowly")){
			
		}
		// 10. [optional] Add a points variable that will calculate their final score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}
