class Rings
{
	String name;
	String product;
	double price;
	int numbers;
	String[] args=new String[5];
	
	Rings(String []args)
	{
	System.out.println("beautiful finger rings");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	Rings(String n)
	{
		name = n;
	}
	
	Rings(String n, String pr,double p, int nu)
	{
		this(n);
		this.product=pr;
		this.price=p;
		this.numbers=nu;
	}
	
	String printAll()
	{
		String display = name + "\t" + product + "\t" + price + "\t" +numbers;
		return display;
	}
}