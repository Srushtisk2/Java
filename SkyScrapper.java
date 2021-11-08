class SkyScrapper
{
	String name;
	float numbers;
	int LENGTH;
	
	SkyScrapper(String n)
	{
		name = n;
	}
	
	SkyScrapper(String n, float b, int length)
	{
		name = n;
		numbers = b;
		LENGTH = length;
		
	}
	
	String printAll()
	{
		String display = name + "\t" + numbers + "\t" + LENGTH;
		return display;
	}
}