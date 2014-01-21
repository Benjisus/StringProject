package Three.controller;
import Three.view.StringView;

/**
 * String Controller for the third project dealing with Strings in Java.
 * @author Ben Hammond
 *
 */
public class StringController
{
	//Declaration Section
	//All needed models and view objects
	private StringView myView;
	
	/**
	 * Creates a StringController object initializing all values.
	 */
	
	public StringController()
	{
		myView = new StringView();
	}
	
	/**
	 * Starts the view using the dislayError method from StringView.
	 */
	
	public void start()
	{
		//myView.displayError();
//		myView.showPassedValue(myView.getResponse());
//		myView.moreInteractive("Ben", myView.getResponse());
		myView.testStringMethods();
		
		
	}

}
