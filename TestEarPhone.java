class TestEarPhone
{
	public static void main (String []sru)
	{
		EarPhone earphone=new EarPhone("Mi");
		String out=earphone.printAll();
		System.out.println(out);
		
		float RANGE = 100.2f;
		EarPhone ph=new EarPhone("Mi",26,RANGE);
		System.out.println(ph.printAll());
    }
}	