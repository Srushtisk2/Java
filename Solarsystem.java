public class Solarsystem
{
     static String count() 
	{
		return "how many planets are in solarsystem";
	}
	
	static void orbit(String [] planets)
	{
		for(int num = 0; num < planets.length; num++)
		System.out.println(planets[num]);
	}
}