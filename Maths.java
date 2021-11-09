class Maths
{
	String name;
	String sub;
	boolean integration;
	short topics;
	String[] args=new String[5];
	
	Maths(String []args)
	{
	System.out.println("number of topics");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	Maths(String n)
	{
		name = n;
	}
	
	Maths(String n, String s,boolean in, short t)
	{
		this(n);
		this.sub=s;
		this.integration=in;
		this.topics=t;
	}
	
	String printAll()
	{
		String display = name + "\t" + sub + "\t" + integration + "\t" +topics;
		return display;
	}
}