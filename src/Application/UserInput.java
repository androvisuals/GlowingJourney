package Application;
import java.util.*;
//import java.util.*;

public class UserInput 
{
	String consoleInput;
	public void getUserInput()
	{
		//request user input
		System.out.println("Please enter text");
		Scanner consoleIn = new Scanner(System.in);
		
		consoleInput = consoleIn.nextLine();//gets line input from console
		//System.out.println("the text input is " + consoleStr);
		if(consoleInput.equals("end game"))
		{
			System.out.println("Game is over, program terminated");
			System.exit(0);//ends game if "end game" is typed in
		}
		
	}
}
