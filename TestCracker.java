class TestCracker
{
	public static void main (String []sru)
	{
		Cracker cracker=new Cracker("Flower");
		String res=cracker.printAll();
		System.out.println(res);
		
		long number = 254875L;
		Cracker crack=new Cracker("Flower","Raw",number);
		System.out.println(crack.printAll());
    }
}	