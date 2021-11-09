class TestMaths
{
	public static void main (String []args)
	{
		Maths maths=new Maths(args);
		
		Maths math=new Maths("differentiation");
		
		
		
		String out=math.printAll();
		System.out.println(out);
		
		boolean integretion=true;
        short topics=3;
		
		Maths mat=new Maths("differentiation","trignometry",integretion,topics);
		String result=mat.printAll();
		System.out.println(result);
    }
}	