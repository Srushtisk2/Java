class TestRemote
{
	public static void main (String []sru)
	{
		Remote remote=new Remote("hatway");
		String out=remote.printAll();
		System.out.println(out);
		
		double PRICE = 100d;
		Remote pri=new Remote("hatway",2,PRICE);
		System.out.println(pri.printAll());
    }
}	