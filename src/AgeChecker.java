import javax.swing.JOptionPane; 


public class AgeChecker {

	public static void main(String[] args) {
		//Declaring and initializing variables and asking user for input
		String firstName = JOptionPane.showInputDialog(null, "What is your first name?"); 
		String lastName = JOptionPane.showInputDialog(null, "What is your last name?"); 
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "What year were you born?")); 
		
		boolean oldEnough = verifyLegalAge(yearOfBirth); 
		String fullName = concatenateNames(firstName, lastName);
		
		//if statement for boolean logic 
		if(oldEnough == true) {
			JOptionPane.showMessageDialog(null, fullName + ", you may proceed with your shopping.");
		} else {
			JOptionPane.showMessageDialog(null, fullName + ", you are not old enough");
		}
		
	}
	
	//Create method for verifying age 
	public static boolean verifyLegalAge(int yob) {
		boolean legalAgeStatus = (2013 - yob ) >= 19;
		return legalAgeStatus; 
	}
	
	//Create method for full name
	public static String concatenateNames(String fn, String ln) {
		String fullName = fn + " " +ln; 
		return fullName; 
	}
}
