import java.net.URL;
import java.util.Scanner;
public class DriverHW5 
{
	public static void main(String[] args)
	{
		MinecraftMobAttributes Skeleton = new MinecraftMobAttributes("Skeleton", 20, 4, "Bones, Arrows");
		MinecraftMobAttributes Creeper = new MinecraftMobAttributes("Creeper", 20, 22, "Gunpowder");
		Skeleton.display();
		Creeper.display();
	
		String CardJSON = DriverHW5.getJSON("https://api.hearthstonejson.com/v1/25770/enUS/cards.json");
		System.out.println(CardJSON);
	}
	
	static String getJSON(String urlString)	
	{
		String line = "";
		try
		{
			URL url = new URL(urlString);
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext())
			{
				line += input.nextLine();
			}
			input.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			line = "Can't Get URL";
		}
		return line;
		 
	}
}
