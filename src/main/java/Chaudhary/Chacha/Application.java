package Chaudhary.Chacha;

import java.util.ArrayList;     //a list is simply an interface and the array list is the implementation of that interface.
import java.util.List;
//import org.apache.commons.lang3.StringUtils;

public class Application {

	// method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
		System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		//int count = app.countWords("I've four words");
		//System.out.println("Word Count: "+count);
    }
	
	public Application() {
	
		System.out.println ("Inside Application");
    }

    public void greet(){
		List<String> greetings = new ArrayList<> ();   // list and array list within method called greet.
		greetings.add("Hello");
		
		for (String greeting : greetings){
			System.out.println("Greeting: "+ greeting);
		}
	}
/**	public int countWords (String words){
		String[] seperateWords = StringUtils.split(words, ' ');
		return (seperateWords == null) ? 0 : seperateWords.length;
	}   **/
}