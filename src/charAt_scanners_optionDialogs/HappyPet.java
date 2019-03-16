package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int hapinesslevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String Pet = JOptionPane.showInputDialog("*smash bros anouncer voice again* CHOOSE YOUR PET");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Make your "+Pet+" love you! Do it! IT'S IN YOUR CONTRACT.", "Devil's dea- Ah, I mean, Pet care!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Sing", "Food/Water", "Walk" }, null);
if(task==0) {
	Song();
}
else if(task==1) {
	Feed();
}
else if(task==2) {
	Walksy();
}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void Song () {
		JOptionPane.showMessageDialog(null, "Seriously, why isn't this a common thing? Singing is fun! As long as no one is around who can tell what you're singing. And judge you. Your pet doesn't judge you.");
	hapinesslevel=(+20);
	}

	static void Feed() {
		JOptionPane.showMessageDialog(null, "Oh yeah I guess that's necessary. Your pet is now full.");
		hapinesslevel=(+15);
	}
	
	static void Walksy() {
		JOptionPane.showMessageDialog(null, "The outcome of this really depends on the kind of pet you have. It works well for a dog, not so much for a lizard or something like that. Nevertheless, your pet is satisfied.");
	}
}