package application;
import java.util.*;
//Later on break this down into classes for weapons, shields, hull etc.
//ship is becoming bloated with ship qualities.
public class Ship 
{
	private String shipName ;
	private Integer shields ;
	private Integer hull; // Declaration
	private Integer weaponAccuracy = 1;
	private Integer weaponDamage = 1;
	private Integer evasion;
	private Integer chanceToHit = 5;
	
	private Crew shipCrew ;//Variable declaration. means i can make an object now and assign values to it later.
	
	public Ship(String newShipName, String crewType,int newCrewSize, int newHull, int newShields, 
			int newWeaponAccuracy,int newWeaponDamage, int newEvasion, int newChanceToHit) //constructor
	{
		shipName = newShipName;
		hull = newHull; // definition
		shields = newShields;
		weaponAccuracy = newWeaponAccuracy; 
		weaponDamage = newWeaponDamage;
		evasion = newEvasion;
		chanceToHit = newChanceToHit;
		shipCrew = new Crew(crewType,newCrewSize);
		
	}
	void setShields(int newShieldValue)
	{
		shields  = newShieldValue;
	}
	Integer getShields()
	{
		return shields;
	}
	void damageShields(int damage)
	{
		shields -= damage;
		//stop shields becoming negative
		if (shields <= 0) 
		{
			System.out.println("Shields have been destroyed !");
			shields = 0;
			
		}
	}
	void setHull(int newHullValue)
	{
		hull  = newHullValue;
	}
	Integer getHull()
	{
		return hull;
	}
	void damageHull(int damage)
	{
		hull -= damage;
		//stop shields becoming negative
		if (hull <= 0) 
		{
			hull = 0;
			System.out.println("The opposing ship has been destroyed !");
		}
	}
	
	void setWeaponAccuracy(int newAccuracyValue)
	{
		weaponAccuracy = newAccuracyValue;
	}
	Integer getWeaponAccuracy()
	{
		return weaponAccuracy;
	}
	void setWeaponDamage(int newDamageValue)
	{
		weaponDamage = newDamageValue;
	}
	Integer getWeaponDamage()
	{
		return weaponDamage;
	}
	void setEvasion(int newEvasionValue)
	{
		evasion = newEvasionValue;
	}
	Integer getEvasion()
	{
		return evasion;
	}
	void setChanceToHit(int newChanceToHit)
	{
		chanceToHit = newChanceToHit;
	}
	Integer getChanceToHit()
	{
		return chanceToHit;
	}
	Crew getCrew()
	{
		return shipCrew;
	}
	
	
	void getShipInfo()
	{
		System.out.println("///////////" + shipName.toUpperCase( )+ " DATA///////////////");
		System.out.println("The ships type is " + shipName);
		System.out.println("ship hull is " + hull);
		System.out.println("ship shields is " + shields);
		System.out.println("ship weapon damage is " + weaponDamage);
		System.out.println("ship evasion is " + evasion);
		System.out.println("ship chance to hit  is " + chanceToHit);
		//System.out.println("Total crew members is  " + getCrew().getCrewSize());
	}
	
}
