package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int hapinesslevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
int Num = JOptionPane.showOptionDialog(null, "CHOOSE YOU PET", "CHOOSE YOU PET", 0, JOptionPane.INFORMATION_MESSAGE, null,
		new String[] { "Cat", "Dog", "Lizard"}, null);

String Pet = "";
if(Num==0) {
	Pet = "Cat";
}
else if(Num==1) {
	Pet = "Dog";
}
else if(Num==2) {
	Pet = "Lizard";
}
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 20; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Make your "+Pet+" love you! Do it! IT'S IN YOUR CONTRACT.", "Devil's dea- Ah, I mean, Pet care!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Sing", "Feed", "Toys"}, null);
if(task==0) {
	Song(Pet);
}
else if(task==1) {
	Feed(Pet);
}
else if(task==2) {
	Toy(Pet);
}
		
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		if(hapinesslevel>100) {
			JOptionPane.showMessageDialog(null, "Congratulations; Your pet officially loves you!");
		break;
		}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void Song (String param) {
		if(param.equals("Lizard")) {
		JOptionPane.showMessageDialog(null, "Lizards can't hear sounds, only feel vibrations.");
	    hapinesslevel=hapinesslevel+10;
		}
		else if(param.equals("Dog")) {
			JOptionPane.showMessageDialog(null, "Dogs always look happy when you talk to them, I doubt singing is any different!");
		hapinesslevel=hapinesslevel+20;
		}
		else if(param.equals("Cat")) {
			JOptionPane.showMessageDialog(null, "Cats have VERY sensitive hearing, so keep your voice down.");
		hapinesslevel=hapinesslevel+10;
		}
	}

	static void Feed(String param) {
		if(param.equals("Lizard")) {
		JOptionPane.showMessageDialog(null, "Just put in some crickets and watch the show!");
		hapinesslevel=hapinesslevel+15;
		}
		else if(param.equals("Dog")) {
			JOptionPane.showMessageDialog(null, "Dogs eat a anything from my experience, including bacon, hamburgers, cheese...");
		hapinesslevel=hapinesslevel+25;
		}
		else if(param.equals("Cat")) {
			JOptionPane.showMessageDialog(null, "I don't actually know what you feed a cat... Does kitty kibble exist or something??");
		hapinesslevel=hapinesslevel+15;
		}
	}
	static void Toy(String param) {
		if(param.equals("Lizard")) {
			JOptionPane.showMessageDialog(null, "What lizard do you have that plays with toys?");
		hapinesslevel=hapinesslevel+5;
		}
		else if(param.equals("Dog")) {
		JOptionPane.showMessageDialog(null, "FETCH! If you couldn't tell, dogs are meant to be the easiest in this game");
	    hapinesslevel=hapinesslevel+20;
	    }
	else if(param.equals("Cat")) {
		JOptionPane.showMessageDialog(null, "And here we observe the ferocious housecat as it stalks it's prey... a stuffed mouse");
		hapinesslevel=hapinesslevel+20;
	}
	}
}