class TestTraffic
{
	public static void main (String []sru)
	{
		Traffic traffic=new Traffic("Pune");
		String res=traffic.printAll();
		System.out.println(res);
		
		float area = 40.23f;
		Traffic tfc=new Traffic("Pune","Agra",25.5f);
		System.out.println(tfc.printAll());
    }
}	