class Cracker
{
	String name;
	String materials;
	long number;
	
	Cracker(String n)
	{
		name = n;
	}
	
	Cracker(String n,String m, long e)
	{
		name = n;
		materials = m;
		number = e;
	}
	
	String printAll()
	{
		String display = name + "\t" + materials + "\t" + number;
		return display;
	}
}

		
	