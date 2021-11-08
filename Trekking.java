class Trekking
{
	String point;
	float numbers;
	float DISTANCE;
	
	Trekking(String p)
	{
		point = p;
	}
	
	Trekking(String p, float n, float distance)
	{
		point = p;
		numbers = n;
		DISTANCE = distance;
		
	}
	
	String printAll()
	{
		String display = point + "\t" + numbers + "\t" + DISTANCE;
		return display;
	}
}