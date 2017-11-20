package Application;


import java.util.*;
import javafx.*;


//to use another class create an object of it.
public class Main 
{
	///////////////////////////GUI WITH JAVAFX/////////////////////////////////////////////
	
///////////////////////////GUI END/////////////////////////////////////////////
	//to do crew battle system
	//ship battle system.
	//Check out simple GUI (later steps for now). ?? JAVAFX seems to be pretty awesome
	// bring up a game interface which lists console commands
	//Mains becoming bloated need to push them back into the classes
	//gonna try and commit this to a repo
	
	public static void main(String[] args) 
	{	
		
		//set game over to false so the game loop runs
		boolean isGameOver = false;
		RandomGenerators randNum = new RandomGenerators();
		TurnData gameTurn = new TurnData();
		UserInput userInput = new UserInput();
		String currentEncounter = "";
		//declares encounter size for now, can make a difficulty level later . String to array detail
		EncounterDatabase encounterDatabase = new EncounterDatabase(10);
		
		//************************************************
		// Initializing data with setters (A) VS initializing with class constructor (B) 
		//Ship testShip; //Defining
		
		////(A) Initializing hull with setter 
		//testShip = new Ship(); //Declaring ship
		//testShip.setHull(5);
		
		////(B) Initializing hull with ship class constructor
		//testShip = new Ship(5);
		//************************************************
		System.out.println("Random number output is " + randNum.randomGenerator(8));
		//generate encounters first
		currentEncounter =  encounterDatabase.getEncounter(15);
	
		//String keyReturned = encounter.getEncounters(0, encounter);
		//generates a ship here for now
		Ship playerShip = new Ship("Player","Player crew" ,3 ,10,4 ,20,4 ,3 ,5 );
		Ship enemyShip = new Ship("Pirate" ,"Pirate crew" ,6 ,5 ,12,8 ,2 ,0 ,2 );
		
		ShipBattle shipBattle = new ShipBattle(playerShip, enemyShip);
		
		System.out.println("////////////////////");
		//System.out.println("Did player ship hit enemy ship = " + shipBattle.testToHit(playerShip, enemyShip) ) ;
		//System.out.println("Did enemy ship hit player ship = " + shipBattle.testToHit(enemyShip, playerShip) ) ;
		//generates a crew per ship, note the getCrew method
		Crew playerCrew =  playerShip.getCrew();
		Crew enemyCrew =  enemyShip.getCrew();
		
		playerShip.getCrew().getCrewInfo();
//		System.out.println("player crew total is " + playerCrew.getCrewSize() );
//		System.out.println("player crew attack total is  " + playerCrew.getCrewAttack() );
//		System.out.println("player crew defense total is  " + playerCrew.getCrewDefense() );
//		
//		System.out.println("enemy crew total is " + enemyCrew.getCrewSize() );
//		System.out.println("enemy crew attack total is  " + enemyCrew.getCrewAttack() );
//		System.out.println("enemy crew defense total is  " + enemyCrew.getCrewDefense() );
		
		System.out.println("Current encounter string is " + currentEncounter);
		
		//System.out.println("Players ship hull is " + playerShip.getHull());
		//System.out.println("enemy ship hull is " + enemyShip.getHull());
		
		//generate empty line
		
		System.out.println("////////////////////////");
		//gameTurn.isGameOver = false;
		
		//this is the game loop, game over false means keep playing
		while(isGameOver == false)
		{
			shipBattle.testToHit();
			playerShip.getShipInfo();
			enemyShip.getShipInfo();
			userInput.getUserInput();
			
		}
//		if (isGameOver == true) 
//		{
//			System.exit(0);
//		}
		//TODO write game over here
		//fix bug where hull damage info isn't being updated
	}

}