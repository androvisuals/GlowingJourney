package application;

public class ShipBattle 
{
	//SO battle system is this. No turn based. At the same time.
	//The ships fire at each other.
	//resolve chance to dodge. If dodge succesfull its a miss.
	//if a hit take one off shields , if theres no shields then take it off the hull
	//if hull is 0 ship is destroyed.
	
	//start simple try to get both ships in here. 
	RandomGenerators randomNum = new RandomGenerators();
	Ship playerShipInBattle;
	Ship enemyShipInBattle;
	
	Integer playerShipChanceToHit;
	Integer enemyShipChanceToHit;
//	Ship getShip(Ship playerShip)
//	{
//		return playerShip;
//	}
	public ShipBattle(Ship playerShip ,Ship enemyShip)
	{
		playerShipInBattle = playerShip;
		enemyShipInBattle = enemyShip;
		//System.out.println("This is the player ship i think shields are " + playerShipInBattle.getShields());
		//System.out.println("This is the enemy ship i think shields are " + enemyShipInBattle.getShields());
		
	}
	void testToHit()
	{
		
		playerShipChanceToHit = playerShipInBattle.getChanceToHit() + randomNum.randomGenerator(playerShipInBattle.getWeaponAccuracy());
		enemyShipChanceToHit = enemyShipInBattle.getChanceToHit();
		
		System.out.println("Player ship chance to hit is " + playerShipChanceToHit);
		System.out.println("Enemy ship chance to hit is " + enemyShipChanceToHit);
		
		/////////////////player ship////////////////
		//check for hit, add random number later
		if (playerShipChanceToHit >= enemyShipInBattle.getEvasion()) 
		{
			System.out.println("The player hits the enemy causing " + playerShipInBattle.getWeaponDamage() + " points of damage to the enemy");
			if (enemyShipInBattle.getShields() > 0 && enemyShipInBattle.getHull() > 0) 
			{
				enemyShipInBattle.damageShields(playerShipInBattle.getWeaponDamage() );
			}
			else if(enemyShipInBattle.getShields() <= 0)
			{
				System.out.println("Is hull hit registering ?? ");
				enemyShipInBattle.damageHull(playerShipInBattle.getWeaponDamage());
			}
		}
	}
	void shipBattleInfo()
	{
		System.out.println("Player ship chance to hit is " + playerShipChanceToHit);
		System.out.println("Enemy ship chance to hit is " + enemyShipChanceToHit);
		System.out.println("The player hits the enemy causing " + playerShipInBattle.getWeaponDamage() + " points of damage to the enemy");
	}
}
