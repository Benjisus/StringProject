package Three.view;

import javax.swing.JOptionPane;
/**
 * View object for the String project.
 * @author bham6713
 *
 */
public class StringView
{


	/**
	 * Shows the error when a non integer is typed into the JOptionPane input field.
	 */
	public void displayError()
	{
		int test;
		String temp;
		
		JOptionPane.showMessageDialog(null, "Let's watch the program crash!");
		temp = JOptionPane.showInputDialog("Type your favorite numer!");
		test = Integer.parseInt(temp);
		JOptionPane.showMessageDialog(null, "Your favorite number is " + test);
		
		
	}
	//Must have a value assigned to a variable in a method or it cannot be used and will cause an error.
	public String getResponse()
	{
		String response = null;
	    response = JOptionPane.showInputDialog("What is your favorite color");
		return response;
	}
	
	public void showPassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, "your favorite color is " + currentValue);
	}
	
	public void moreInteractive(String first, String second)
	{
		JOptionPane.showMessageDialog(null, "Hey" + first + "\n says: " + "\n" + second);
	}
	
	public void testStringMethods()
	{	
		testStartsWith('I');
		testReplace('r','t');
		testToLowerCase();
		testEndsWith();
		testSubString(6);
	}
	
	private void testSubString(int startPosition)
	{
	String testString = "Tatheritricks";
	JOptionPane.showMessageDialog(null, "This substring method test!");
	JOptionPane.showMessageDialog(null, "We are going to go from the " + startPosition + "'th letter in the test string");
	JOptionPane.showMessageDialog(null, "The test string is: " +"\n" + testString);
	JOptionPane.showMessageDialog(null, "The testString.substring(startPosition) call gives us: " + "\n"+ testString.substring(startPosition));
	}
	private void testStartsWith(int startLetter)
	{
		String testString = "Ingrid";
		JOptionPane.showMessageDialog(null, "This is a StartsWith method test!");
		JOptionPane.showMessageDialog(null, "Lets try this out! We are trying to see if the String starts with I");
		JOptionPane.showMessageDialog(null, "The test is: "+ "\n" + testString);
		JOptionPane.showMessageDialog(null, "This test will give us: " + "\n" + testString.startsWith(testString));
	}
	
	private void testReplace(char oldChar, char newChar)
	{
		String testString = "There once was a purple turtle";
		JOptionPane.showMessageDialog(null, "Lets try to replace the letters of this sentence!");
		JOptionPane.showMessageDialog(null, "The sentence is " + "\n" + testString);
		JOptionPane.showMessageDialog(null, "Lets take out all of the R's and replace them with T's");
		JOptionPane.showMessageDialog(null, "This test will give us: " + "\n" + testString.replace('r', 't'));
	}
	
	private void testToLowerCase()
	{
		String testString = "HELLO WATCH THESE LETTERS CHANGE";
		JOptionPane.showMessageDialog(null, "Now let's try to change the case of a sentence");
		JOptionPane.showMessageDialog(null, "The sentence we are changing is" + "\n" + testString);
		JOptionPane.showMessageDialog(null, "This test will give us" + "\n" + testString.toLowerCase()); 
	}
	
	private void testEndsWith()
	{
		String testString = "Santas coming to town";
		JOptionPane.showMessageDialog(null, "We are going to see if the sentence ends with a certain suffix");
		JOptionPane.showMessageDialog(null, "We are testing the sentence Santas coming to town");
		JOptionPane.showMessageDialog(null, "Lets see if it ends with own");
		JOptionPane.showMessageDialog(null, "This test will give us" + "\n " + testString.endsWith("own"));
	}
}
