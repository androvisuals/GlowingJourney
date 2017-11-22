package application;
import java.util.*;

public class Crew 
{
	String crewType;
	//make an array list to hold crew, can dynamic
	private ArrayList<CrewMember> crewMembers = new ArrayList<CrewMember>(); 
	//constructor requires a crew amount to be created when its declared
	public Crew(String newCrewType, int crewAmount) //maybe drop the constructor ??
	{
		crewType = newCrewType;
		for (int i =0; i < crewAmount; i++)
		{
			addCrewMember();
		}
	}
	void setCrewType(String newCrewType)
	{
		crewType = newCrewType;
	}
	String getCrewType()
	{
		return crewType;
	}
	void addCrewMember()
	{
		CrewMember aCrewMember = new CrewMember(5,6,7);		
		crewMembers.add(aCrewMember);
	}
	CrewMember getCrewMember(int index)
	{
		return crewMembers.get(index);
	}
	int getCrewSize()
	{
		return crewMembers.size();
	}
	
	int getCrewAttack() 
	{
		int crewAttack =0;
		for(int i = 0; i < crewMembers.size(); i++) 
		{
			crewAttack += getCrewMember(i).getAttack();
		}
		return crewAttack;
	}
	int getCrewDefense() 
	{
		int crewDefense =0;
		for(int i = 0; i < crewMembers.size(); i++) 
		{
			crewDefense += getCrewMember(i).getDefense();
		}
		return crewDefense;
	}
	void getCrewInfo()
	{
		System.out.println("///////////CREW DATA///////////////");
		System.out.println("The crew type is " + getCrewType());
		System.out.println("Crew amount is " + getCrewSize());
		System.out.println("Crew total attack is  " + getCrewAttack());
		System.out.println("Crew total defense is  " + getCrewDefense());
	}
	
}
