package application;
import java.util.*;
//import java.util.*;


public class UserInput 
{
	String consoleInput;
	
	void getUserInput()
	{
		//sue string to look for equals AND pass it back to use in engine
		//request user input
		System.out.println("press i for information");
		//scanner
		Scanner consoleIn = new Scanner(System.in);
		
		consoleInput = consoleIn.nextLine();//gets line input from console
		//System.out.println("the text input is " + consoleStr);
		if(consoleInput.equals("1"))
		{
			System.out.println("Going to next turn");
			
		}
		if(consoleInput.equals("2"))
		{
			System.out.println("Trying to get ship info");
			System.out.println("You pressed 2 , in userInput main");
			//Ship playerShip = new Ship() ;
			//playerShip.getShipInfo();
			
			
		}
		if(consoleInput.equals("end game"))
		{
			System.out.println("Game is over, program terminated");
			System.exit(0);//ends game if "end game" is typed in
		}
		if (consoleInput.equals("i") ) 
		{
			System.out.println("Press 1 for next turn | " + "press 2 for ship info | " + "Press 3 for crew info |" );
			consoleInput = "i";
		}
		
		//return consoleInput + "User input was used";
		
	}
//	void gameInstructions() 
//	{
//		System.out.println("Press 1 for next turn | " + "press 2 for ship info | " + "Press 3 for crew info |" );
//	}
}
