package application;

public class ShipGenerator 
{
	//generates a ship based  based upon key value
	Ship ship = new Ship();
	Crew shipCrew ;//= new Crew(" Empty crew type", 0);//Variable declaration. means i can make an object now and assign values to it later.
	Ship shipGenerator(int key)
	{
		
		
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
}
