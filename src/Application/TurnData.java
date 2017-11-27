package application;
import java.util.*;
public class TurnData 
{
	public boolean hasGameStarted = false;
	public boolean isGameOver = false;
	public int turnNumber = 0;
	boolean triggerTurn = true;
	
	//creates an alternating turn swap
	
	void setHasGameStarted(boolean newHasGameStarted)
	{
		hasGameStarted = newHasGameStarted;
	}
	Boolean getHasGameStarted() 
	{
		return hasGameStarted;
	}
	void setIsGameOver(Boolean newIsGameOver)
	{
		isGameOver = newIsGameOver;
	}
	Boolean getIsGameOver()
	{
		return isGameOver;
	}
	public int getTurn()
	{	
		//System.out.println("the current turn is " + turnNumber);
		return turnNumber;
	}
	public void switchTurn()
	{
		triggerTurn = !triggerTurn;
	}
	public void nextTurn()
	{
		System.out.println("next turn was activated");
		if(triggerTurn)
		{
			//do turn stuff
			switchTurn();
			
		}
		if(!triggerTurn)
		{
			//do turn stuff
			switchTurn();
			
		}
		//turnNumber += 1;
	}
	
}
