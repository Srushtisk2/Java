class TestKeyBoard
{
	public static void main (String []sru)
	{
		KeyBoard keyboard=new KeyBoard("Dell");
		String out=keyboard.printAll();
		System.out.println(out);
		
		short DOB = 1856;
		KeyBoard key=new KeyBoard("Dell","board",DOB);
		System.out.println(key.printAll());
    }
}	