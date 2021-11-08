class Traffic
{
	String name;
	String location;
	float area;
	
	Traffic(String n)
	{
		name = n;
	}
	
	Traffic(String n, String l,float a)
	{
		name = n;
		location = l;
		area = a;
	}
	
	String printAll()
	{
		String display = name + "\t" + location + "\t" + area;
		return display;
	}
}