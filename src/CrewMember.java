
public class CrewMember 
{
	private String crewMemberName;
	private Integer health = 10;
	private Integer attack = 0 ;
	private Integer defense = 0;
	
	//private CrewMember crewMember;
	public CrewMember(int initHealth, int initAttack, int initDefense ) 
	{
		health = initHealth;
		attack = initAttack;
		defense = initDefense;
	}
	void setCrewMemberName(String newCrewMemberName)
	{
		crewMemberName = newCrewMemberName;
	}
	String getCrewMemberName()
	{
		return crewMemberName;
	}
	Integer getHealth()
	{
		return health;
	}
	void setHealth(int modHealth)
	{
		health -= modHealth;
	}
	Integer getAttack()
	{
		return attack;
	}
	void setAttack(int modAttack)
	{
		attack -= modAttack;
	}
	Integer getDefense()
	{
		return defense;
	}
	void setDefense(int modDefense)
	{
		defense -= modDefense;
	}
}
