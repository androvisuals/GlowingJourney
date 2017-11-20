package application;
import java.util.*;
public class TurnData 
{
	public boolean hasGameStarted = false;
	public boolean isGameOver = false;
	public int turnNumber = 0;
	
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
		System.out.println("the current turn is " + turnNumber);
		return turnNumber;
	}
	public void nextTurn()
	{
		turnNumber += 1;
	}
	
}
