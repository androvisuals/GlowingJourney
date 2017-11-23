package application;


//import java.awt.Button;//this conflicts with javafx button, leave for now
import java.util.*;
import javafx.*;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;;

//to use another class create an object of it.
public class Main extends Application implements EventHandler<ActionEvent>
{

	
	///////////////////////////GUI WITH JAVAFX/////////////////////////////////////////////
	Button btn_0 = new Button();
	Text text_0 ;
	//so a window is a STAGE in javaFX, the contents of the window are the scenes
	@Override
	public void start(Stage primaryStage) 
	{
		try 
		{
			primaryStage.setTitle("The Game window");//sets window title
			//btn_0 = new Button();//makes a new button
			btn_0.setText("click me");//sets text to click me 
			btn_0.setOnAction(this);//this means i could make a whole new class for handling events, do later
			
			text_0 = new Text();
			text_0.setText("test text box");
			text_0.setLayoutX(100);
			text_0.setY(-100);
//			
			StackPane layout = new StackPane();//Stackpane is a layout system
			layout.getChildren().add(btn_0);//add button to layout
			layout.getChildren().add(text_0);
			Scene scene = new Scene(layout,100,300);
			primaryStage.setScene(scene);
			primaryStage.show();
			

		} catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

	//to make this i went to source > override/implement methods
	@Override
	public void handle(ActionEvent event) 
	{
		if (event.getSource()==btn_0) 
		{
			System.out.println("btn_0 was pressed");//move this to the gui part
		}
		
	}
	
	///////////////////////////GUI END/////////////////////////////////////////////
	public static void main(String[] args) 
	{	
		
		//Javafx lauch it
//		launch(args);//java fx starts from this, freeze game loop for now
		
		//set game over to false so the game loop runs
		boolean isGameOver = false;
		RandomGenerators randNum = new RandomGenerators();
		TurnData gameTurn = new TurnData();
		UserInput userInput = new UserInput();
		String currentEncounter = "";
		//declares encounter size for now, can make a difficulty level later . String to array detail
		//EncounterDatabase encounterDatabase = new EncounterDatabase(10);

		System.out.println("Random number output is " + randNum.randomGenerator(8));
		//generate encounters first
		//currentEncounter =  encounterDatabase.getEncounter(15);
		
		//String keyReturned = encounter.getEncounters(0, encounter);
		/////////////////////PLAYER SHIP AND CREW///////////////////////
		ShipGenerator shipGenerator = new ShipGenerator();//should be moved out of main into EncounterDatabase.here for testing purposes
		Ship playerShip = shipGenerator.shipGenerator(0);//abstraction use key to generate ship
		playerShip.getShipInfo();
		Crew playerCrew =  playerShip.getCrew();
		playerCrew.getCrewInfo();
		
		/////////////////////ENEMY SHIP AND CREW///////////////////////
		Ship enemyShip = shipGenerator.shipGenerator(3);//abstraction use key to generate ship
		enemyShip.getShipInfo();
		Crew enemyCrew =  enemyShip.getCrew();
		enemyCrew.getCrewInfo();
		
		
		ShipBattle shipBattle = new ShipBattle(playerShip, enemyShip);
		
		System.out.println("////////////////////");
		
		//generates a crew per ship, note the getCrew method
		
		System.out.println("Current encounter string is " + currentEncounter);
		
		System.out.println("////////////////////////");

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
		// TODO write game over here
		//fix bug where hull damage info isn't being updated
		
	}

}
