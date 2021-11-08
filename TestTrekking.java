class TestTrekking
{
	public static void main (String []sru)
	{
		Trekking trekking=new Trekking("Rayagad");
		String out=trekking.printAll();
		System.out.println(out);
		
		float DISTANCE = 362.2f;
		Trekking tr=new Trekking("Rayagad",27,DISTANCE);
		System.out.println(tr.printAll());
    }
}	