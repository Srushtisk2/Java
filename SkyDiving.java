class SkyDiving
{
	String name;
	String location;
	short yoc;
	float height;
	String[] args=new String[5];
	
	SkyDiving(String []args)
	{
	System.out.println("different skyDiving are follows");
	for(int i=0;i<args.length;i++)
	{
	System.out.println(args[i]);
	}
}

	
	
	SkyDiving(String n)
	{
		name = n;
	}
	
	SkyDiving(String n, String l,short y, float h)
	{
		this(n);
		this.location=l;
		this.yoc=y;
		this.height=h;
	}
	
	String printAll()
	{
		String display = name + "\t" + location + "\t" + yoc + "\t" +height;
		return display;
	}
}