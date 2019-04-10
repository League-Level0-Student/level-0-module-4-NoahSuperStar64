import javax.swing.JOptionPane;

public class ChooseYourOwn {
public static void main(String[] args) {
	
	
	JOptionPane.showMessageDialog(null, "This is the world of Hocolatia. Previously a peaceful land,\n the tranquility has been broken by the rising forces of the evil Queen Umbra, the world-consuming Termina Catastrophe, and the mecha-beast Moruega.\n Only you and two others can stop them.");

	String Hero = JOptionPane.showInputDialog("Name yourself, a valiant archer gifted with magical wings");
	String MagicUser = JOptionPane.showInputDialog("Name your friend, a brilliant spellcaster well versed in the ancient art of magic.");
	String Monster = JOptionPane.showInputDialog("Finally, name the massive beast that you'll meet on your journey.");
	
int Story1 = JOptionPane.showOptionDialog(null, "The capital city Hocolan is under siege by Queen Umbra's dark knights.\n You manage to escape along with "+MagicUser+". You have a few options here, so choose wisely.", "Capital falling", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Charge back in and battle the knights", "Retreat for now", "Try and shoot the knights from a distance"}, null);
	if(Story1==0) {
		JOptionPane.showMessageDialog(null, "That barely worked...\n But you managed to take back hocolan with some brute force.");
	
	}
	
	else if(Story1==1) {
		JOptionPane.showMessageDialog(null, "You decide that a tactical retreat is the best option, and you start traveling away from hocolan.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}