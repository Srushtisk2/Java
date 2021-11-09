class TestSkyDiving
{
	public static void main (String []args)
	{
		SkyDiving skydiving=new SkyDiving(args);
		
		SkyDiving skydi=new SkyDiving("Mountain");
		
		
		
		String out=skydi.printAll();
		System.out.println(out);
		
		short yoc=1887;
        float height=1063.5f;
		
		SkyDiving sky=new SkyDiving("Montain","Jm",yoc,height);
		String result=sky.printAll();
		System.out.println(result);
    }
}	