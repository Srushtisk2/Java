class Eraser
{
	String name;
	String product;
	float cost;
	int num;
	String[] args=new String[5];
	
	Eraser(String []args)
	{
	System.out.println("number of eraser");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	Eraser(String n)
	{
		name = n;
	}
	
	Eraser(String n, String pr,float c, int nu)
	{
		this(n);
		this.product=pr;
		this.cost=c;
		this.num=nu;
	}
	
	String printAll()
	{
		String display = name + "\t" + product + "\t" + cost + "\t" +num;
		return display;
	}
}