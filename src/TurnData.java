import java.util.*;
public class TurnData 
{
	public boolean hasGameStarted = false;
	public boolean isGameOver = false;
	public int turnNumber = 0;
	
	//returns turn number
	public int getTurn()
	{	
		System.out.println("the current turn is " + turnNumber);
		return turnNumber;
	}
	//increments turn number
	public void nextTurn()
	{
		turnNumber += 1;
	}
	
}
