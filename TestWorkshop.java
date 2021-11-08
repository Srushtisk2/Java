class TestWorkshop
{
	public static void main (String []sru)
	{
		Workshop workshop=new Workshop("Mechanical");
		String res=workshop.printAll();
		System.out.println(res);
		
		int NUM = 6;
		Workshop work=new Workshop("Mechanical",26,NUM);
		System.out.println(work.printAll());
    }
}	