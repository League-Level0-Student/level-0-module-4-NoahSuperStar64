import javax.swing.JOptionPane;

public class ChooseYourOwn {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null,
				"This is the world of Hocolatia. Previously a peaceful land,\n the tranquility has been broken by the rising forces of the evil Queen Umbra, the world-consuming Termina Catastrophe, and the mecha-beast Moruega.\n Only you can stop them, blah blah, you've heard this backstory before.");

		int Story1 = JOptionPane.showOptionDialog(null,
				"The capital city Hocolan is under siege by Queen Umbra's dark knights.\n You manage to escape the city walls with a cutlass and a bow to defend yourself. You have a few options here, so choose wisely.",
				"Capital falling", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Charge back in and swordfight the knights", "Retreat for now",
						"Try and shoot the knights from a distance with your bow" },
				null);
		if (Story1 == 0) {
			JOptionPane.showMessageDialog(null,
					"That barely worked...\n But due to the knights utter stupidity, you managed to take back hocolan with some brute force.");
			Hocolan(Story1);
		}

		else if (Story1 == 2) {
			JOptionPane.showMessageDialog(null, "After some careful sharpshooting, Hocolan is clear of dark knights");
			Hocolan(Story1);
		}

		else if (Story1 == 1) {

			int Story2 = JOptionPane.showOptionDialog(null,
					"You decide that a tactical retreat is the best option.\n Where do you end up?",
					"Bravely running away", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Jellyfish Forest", "Ice Kingdom", "PlaceholderTitle" }, null);
			if (Story2 == 0) {
				JOptionPane.showMessageDialog(null,
						"You arrive at the Jellyfish Forest, a beautiful place of tranquility and ferocity.\nThough the only thing close to a jellyfish in it is\nNomurox, a powerful alien-like protector of the forest.");
			} else if (Story2 == 1) {
				JOptionPane.showMessageDialog(null,
						"You reach the ice kingdom. Once a flourishing land, the recent attacks have forced many to abandon the frozen domain,\n leaving it a barren tundra under a snow-covered peak.");
				int Boss1 = JOptionPane.showOptionDialog(null,
						"Suddenly, the ground begins to shake. The mountain then explodes, leaving the kaiju-sized moruega standing in it's wake.\n There's no escaping moruega's sights, but remember, if you can defeat even one of the three dark forces, the rest will weaken.",
						"Moruega, mecha monster.", 0, JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Catapult yourself onto the monster's face", "Climb inside",
								"" },
						null);
				if (Boss1 == 0) {
					JOptionPane.showMessageDialog(null,
							"...Did you really expect that to work?\nUsing a nearby catapult(Don't ask why a catapult was nearby), you launch yourself onto moruega's face.\nMoruega has eye lasers. Enough said.\nGAME OVER");
				}
				else if (Boss1 == 2) {
					JOptionPane.showMessageDialog(null, "");
				}
				else if (Boss1 == 1) {
					JOptionPane.showMessageDialog(null, "You run up to the robot and start scaling its metal armour.\n Eventually you reach a point where you can crawl inside, and you find what appears to be a large battery surrounded by cables.\nYou cut each cable, careful not to electrocute yourself. After the last cable, Moruega loses power and falls over, while you emerge victorious.\nQueen Umbra and Termina Catastrophe are forced to retreat to your own realm, and peace is restored for the foreseeable future.\nTHE END");
				}
			}
		}

	}

	static void Hocolan(int Stupidity) {
		int Story3 = JOptionPane.showOptionDialog(null,
				"Now that the dark knights have been driven out of Hocolan the people have started to return to their houses.",
				"The fallen Capital", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Stay and restore order",
						"Lead an all out assault on Umbra's castle", "Fortnite dance to assert dominance" },
				null);
		if (Story3 == 0) {
			JOptionPane.showMessageDialog(null,
					"Hocolan is rebuilt, but the presence of Queen Umbra remains a passive threat on the Hocolatian's daily lives until the end of time.\nTHE END...?");
		} else if (Story3 == 2 && Stupidity == 0) {
			JOptionPane.showMessageDialog(null,
					"After the intense battle, you celebrate by doing a fortnite dance.\nThe locals cringe so much that you are arrested and sentenced to life in prison.\nGAME OVER");
		} else if (Story3 == 2 && Stupidity == 2) {
			JOptionPane.showMessageDialog(null,
					"After taking back Hocolan, you celebrate by doing a fortnite dance.\nThe locals no longer take you seriously, but you have bigger problems to worry about.");
		}
	}

}