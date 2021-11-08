class Remote
{
	String name;
	int noOfbuttons;
	double PRICE;
	
	Remote(String n)
	{
		name = n;
	}
	
	Remote(String n, int f, double price)
	{
		name = n;
		noOfbuttons = f;
		PRICE = price;
		
	}
	
	String printAll()
	{
		String display = name + "\t" + noOfbuttons + "\t" + PRICE;
		return display;
	}
}
