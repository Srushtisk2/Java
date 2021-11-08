class Helmet
{
	String name;
	float numbers;
	int COST;
	
	Helmet(String n)
	{
		name = n;
	}
	
	Helmet(String n, float b, int cost)
	{
		name = n;
		numbers = b;
		COST = cost;
		
	}
	
	String printAll()
	{
		String display = name + "\t" + numbers + "\t" + COST;
		return display;
	}
}