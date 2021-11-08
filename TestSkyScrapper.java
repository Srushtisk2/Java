class TestSkyScrapper
{
	public static void main (String []sru)
	{
		SkyScrapper skyscrapper=new SkyScrapper("Parachut");
		String out=skyscrapper.printAll();
		System.out.println(out);
		
		int LENGTH = 258;
		SkyScrapper sky=new SkyScrapper("Parachut",56.3f,LENGTH);
		System.out.println(sky.printAll());
    }
}	