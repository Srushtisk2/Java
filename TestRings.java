class TestRings
{
	public static void main (String []args)
	{
		Rings rings=new Rings(args);
		
		Rings ring=new Rings("platinum");
		
		
		
		String out=ring.printAll();
		System.out.println(out);
		
		double price=5000.24d;
        int numbers=2;
		
		Rings ri=new Rings("Montain","silver",price,numbers);
		String result=ri.printAll();
		System.out.println(result);
    }
}	