class Biscuits
{
	String name;
	String product;
	short price;
	byte numbers;
	String[] args=new String[5];
	
	Biscuits(String []args)
	{
	System.out.println("varities of buiscuits");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	Biscuits(String n)
	{
		name = n;
	}
	
	Biscuits(String n, String pr,short p, byte nu)
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