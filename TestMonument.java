class TestMonument
{
	public static void main (String []sru)
	{
		Monument monument=new Monument("Taj");
		String res=monument.printAll();
		System.out.println(res);
		
		short YOC = 1631;
		Monument monument2=new Monument("Taj","Agra",YOC,42.5f);
		System.out.println(monument2.printAll());
    }
}	