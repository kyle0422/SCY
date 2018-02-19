import javax.swing.JOptionPane;

public class AccountJOptionPane {
	public static void main(String[] args) {
		String nameInput = JOptionPane.showInputDialog("Enter your name:");
		String ageInputStr = JOptionPane.showInputDialog("Enter your age:");
		String emailInput = JOptionPane.showInputDialog("Enter your email:");
		String dobInput = JOptionPane.showInputDialog("Enter your date of birth:");
		String addressInput = JOptionPane.showInputDialog("Enter your address");
		
		int ageInput = Integer.parseInt(ageInputStr);

		JOptionPane.showMessageDialog(null, "Your name is " + nameInput);
		JOptionPane.showMessageDialog(null, "Your age is " + ageInput);
		JOptionPane.showMessageDialog(null, "Your email is " + emailInput);
		JOptionPane.showMessageDialog(null, "Your date of birth is " + dobInput);
		JOptionPane.showMessageDialog(null, "Your address is " + addressInput);

	
	
	}
}
