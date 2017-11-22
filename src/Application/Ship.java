package application;
import java.util.*;
//Later on break this down into classes for weapons, shields, hull etc.
//ship is becoming bloated with ship qualities.
public class Ship 
{
	private String shipName = "No Ship name defined" ;//used to catch lack of declaration
	private String crewType =  "No crew type defined" ;
	private Integer shields = 0;
	private Integer hull = 0 ; // Declaration
	private Integer weaponAccuracy = 1;
	private Integer weaponDamage = 1;
	private Integer evasion = 0;
	private Integer chanceToHit = 5;
	
	private Crew shipCrew = new Crew(" Empty crew type", 0);//Variable declaration. means i can make an object now and assign values to it later.
	//Ship ship ;
//	public Ship(String newShipName, String crewType,int newCrewSize, int newHull, int newShields, 
//			int newWeaponAccuracy,int newWeaponDamage, int newEvasion, int newChanceToHit) //constructor
//	{
//		shipName = newShipName;
//		hull = newHull; // definition
//		shields = newShields;
//		weaponAccuracy = newWeaponAccuracy; 
//		weaponDamage = newWeaponDamage;
//		evasion = newEvasion;
//		chanceToHit = newChanceToHit;
//		shipCrew = new Crew(crewType,newCrewSize);
//		
//	}
	
	void setShipName(String newNameValue)
	{
		shipName  = newNameValue;
	}
	String getShipName()
	{
		return shipName ;
	}
	void setCrewType(String newCrewTypeValue)
	{
		crewType  = newCrewTypeValue;
	}
	String getCrewType()
	{
		return crewType ;
	}
	Crew getCrew()
	{
		return shipCrew;
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
//	Void setCrew()
//	{
//		Crew crew = new Crew("Empty crew",0);
//	}

	Ship shipGenerator(int key)
	{
		Ship ship = new Ship();
		if (key == 0) 
		{
			shipCrew = new Crew("Weak player",2);
			ship.setShipName("weak player ship");
			ship.setCrewType("Weak player Crew");
			ship.setHull(10);
			ship.setShields(4);
			ship.setWeaponAccuracy(3);
			ship.setWeaponDamage(3);
			ship.setEvasion(3);
			ship.setChanceToHit(2);
			return ship;
		}
		
	
		else if (key == 1) 
		{
			shipCrew = new Crew("Strong player",4);
			
			ship.setShipName("Strong player ship");
			ship.setCrewType("Strong player Crew");
			ship.setHull(15);
			ship.setShields(6);
			ship.setWeaponAccuracy(4);
			ship.setWeaponDamage(4);
			ship.setEvasion(3);
			ship.setChanceToHit(3);
			return ship;
		}
		else if (key ==2) 
		{
			shipCrew = new Crew("Weak pirates",2);
			
			ship.setShipName("Weak pirate ship");
			ship.setCrewType("Weak pirate Crew");
			ship.setHull(6);
			ship.setShields(2);
			ship.setWeaponAccuracy(2);
			ship.setWeaponDamage(2);
			ship.setEvasion(2);
			ship.setChanceToHit(2);
			return ship;
			
		}
		else if (key ==3) 
		{
			shipCrew = new Crew("Strong pirates",4);
			
			ship.setShipName("Strong pirate ship");
			ship.setCrewType("Strong pirate Crew");
			ship.setHull(10);
			ship.setShields(4);
			ship.setWeaponAccuracy(3);
			ship.setWeaponDamage(3);
			ship.setEvasion(3);
			ship.setChanceToHit(3);
			return ship;
		}
		return ship;
		
	}
//	Ship enemyShipGenerator(int key)//add crew later
//	{	
//		Ship enemyShip =new Ship();//= new Ship("Ship not generated","Crew Not generated",4, 6, 2, 2, 2, 3,2);
//		
//		
//		if (key ==0) 
//		{
//			shipCrew = new Crew("Weak pirates",2);
//			
//			//ship.setShipName("Weak pirate ship");
//			//ship.setCrewType("Weak pirate Crew");
//			ship.setHull(6);
//			ship.setShields(2);
//			ship.setWeaponAccuracy(2);
//			ship.setWeaponDamage(2);
//			ship.setEvasion(2);
//			ship.setChanceToHit(2);
//			
//			
//		}
//		else if (key ==1) 
//		{
//			shipCrew = new Crew("Strong pirates",4);
//			
//			ship.setShipName("Strong pirate ship");
//			ship.setCrewType("Strong pirate Crew");
//			ship.setHull(10);
//			ship.setShields(4);
//			ship.setWeaponAccuracy(3);
//			ship.setWeaponDamage(3);
//			ship.setEvasion(3);
//			ship.setChanceToHit(3);
//			
//		}
//		return ship;
//		
//	}
	void getShipInfo()
	{
		System.out.println("///////////" + shipName.toUpperCase( )+ " DATA///////////////");
		String shipsName = ("The ships type is " + shipName + " | ");
		String shipHull = ("ship hull is " + hull + "| ");
		String shipShields = ("ship shields is " + shields + " | ");
		String shipWeaponDamage = ("ship weapon damage is " + weaponDamage + " | ");
		String shipEvasion = ("ship evasion is " + evasion + " | ");
		String shipChanceToHit = ("ship chance to hit  is " + chanceToHit + " | ");
		System.out.println(shipsName + shipHull + shipShields); 
		System.out.println(shipWeaponDamage + shipEvasion + shipChanceToHit); 
		//System.out.println("Total crew members is  " + getCrew().getCrewSize());
	}
//	Ship generateShipTypeForEncounter(Integer key)
//	{
//		
//	}
	
}
