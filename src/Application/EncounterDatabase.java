package application;
import java.util.*;

public class EncounterDatabase 
{
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
	
//	void nextEncounter()
//	{
//		
//	}
	
	
}
