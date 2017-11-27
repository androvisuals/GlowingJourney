package application;
import java.util.*;

/*
 what's an encounter for now ?
 An encounter can be a trader/repair station
 An encounter can be a ship battle
 An encounter can be a crew battle.
 
 It's made up of
 1- an index
 2- a flavor string
 3- a type > trader > ship battle > crew battle
 4 - if its a trader then repair ship hull for now and give  a crew member
 5 - if its a ship battle resolve until either ship is destroyed
 6 - if it's a crew battle resolve until it s destroyed.
 
 7 - problems
  This needs to be broken into classes. But I have a lot already
  I already have crew members, need to generate one dynamically
  I already have ships, need to generate them dynamically
  Trader class still needs to be made , it'll call add crew member and fix hull (random amount)
  
  Flavor text type it out
  
  lets try and get it made now in this encounter database
 */
public class EncounterDatabase 
{	
//	private Crew tempCrew;
//	private Ship tempShip;
	
	private Integer currentEncounter = 0;
	ArrayList<String> encounterList = new ArrayList <String> ();
	
	//constructor
	public EncounterDatabase( int arraySize )
	{
		System.out.println( "filling encounter arraylist " + encounterList.toString() );
		for (int i = 0; i < arraySize; i++) 
		{
			//this is used just to fill up the array
			encounterList.add("");
			//encounterList.add("This encounter number is " + Integer.toString(i));
			//System.out.println(encounterList.get(i));
	
		}
	}


	//int randomEncounter = 0;//(int) Math.floor(Math.random() * elemSize);

	
	
	String getEncounter()
	{	//if lookup key is larger than array catch it for now and make key the value of the array size
		if (currentEncounter >= encounterList.size())
		{
			currentEncounter = encounterList.size()-1;
		}
		return encounterList.get(currentEncounter);
		//String value = declareEncounters();
		//return declareEncounters();
		
	}
	//overloaded method fr now
	String getEncounter(int key)
	{	//if lookup key is larger than array catch it for now and make key the value of the array size
		if (key > encounterList.size())
		{
			key = encounterList.size()-1;
		}
		return encounterList.get(key);
		//String value = declareEncounters();
		//return declareEncounters();
		
	}
	void removeEncounter(int key)
	{
		encounterList.remove(key);
	}
	void shuffleEncounterList()
	{
		Collections.shuffle(encounterList);
	}
	void printEncounterList()
	{
		for (int i = 0; i < encounterList.size(); i++) 
		{
			
		}
	}
	
}
