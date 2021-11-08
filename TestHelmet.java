class TestHelmet
{
	public static void main (String []sru)
	{
		Helmet helmet=new Helmet("Dio");
		String out=helmet.printAll();
		System.out.println(out);
		
		int COST = 258;
		Helmet hr=new Helmet("Dio",272.3f,COST);
		System.out.println(hr.printAll());
    }
}	