
public class MinecraftMobAttributes 
{
	String name;
	int mobhealth;
	int mobattack;
	String loot;

	public MinecraftMobAttributes(String name, int mobhealth, int mobattack, String loot)
	{
		
		this.name = name;
		this.mobhealth = mobhealth;
		this.mobattack = mobattack;
		this.loot = loot;
		
	}

	void display()
	{
		System.out.format("Name: %s \nHealth: %d \nDamage: %d \nLoot: %s \n", this.name, this.mobhealth, this.mobattack, this.loot);
	}

}
