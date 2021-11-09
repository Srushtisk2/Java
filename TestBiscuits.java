class TestBiscuits
{
	public static void main (String []args)
	{
		Biscuits biscuits=new Biscuits(args);
		
		Biscuits bisc=new Biscuits("darkfuntasy");
		
		
		
		String out=bisc.printAll();
		System.out.println(out);
		
		short price=50;
        byte numbers=8;
		
		Biscuits bis=new Biscuits("Montain","marrie",price,numbers);
		String result=bis.printAll();
		System.out.println(result);
    }
}	