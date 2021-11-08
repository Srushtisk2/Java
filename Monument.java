class Monument
{
	String name;
	String location;
	short YOC;
	float area;
	
	Monument(String n)
	{
		name = n;
	}
	
	Monument(String n, String l, short yoc, float a)
	{
		name = n;
		location = l;
		YOC = yoc;
		area = a;
	}
	
	String printAll()
	{
		String display = name + "\t" + location + "\t" + YOC + "\t" + area;
		return display;
	}
}

		
	