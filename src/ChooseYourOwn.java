import javax.swing.JOptionPane;

public class ChooseYourOwn {
public static void main(String[] args) {
	
	
	JOptionPane.showMessageDialog(null, "This is the world of Hocolatia. Previously a peaceful land, the tranquility has been broken by the rising forces of the evil Queen Umbra, the world-consuming Termina Catastrophe, and the mecha-beast Moruega. Only you and two others can stop them.");

	String Hero = JOptionPane.showInputDialog("Name yourself, a valiant archer gifted with magical wings");
	String MagicUser = JOptionPane.showInputDialog("Name your friend, a brilliant spellcaster well versed in the ancient art of magic.");
	String Monster = JOptionPane.showInputDialog("Finally, name the massive beast that you'll meet on your journey.");
	
	JOptionPane.showOptionDialog(null, "The capital city Hocolan is under siege by Queen Umbra's dark knights. You manage to escape along with "+MagicUser+". You have a few options here, so choose wisely.", "Capital falling", 0, JOptionPane.INFORMATION_MESSAGE, null, options, initialValue)
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}