class TestEraser
{
	public static void main (String []args)
	{
		Eraser eraser=new Eraser(args);
		
		Eraser eras=new Eraser("apsara");
		
		
		
		String out=eras.printAll();
		System.out.println(out);
		
		float cost=25.2f;
        int num=2;
		
		Eraser er=new Eraser("apsara","nataraj",cost,num);
		String result=er.printAll();
		System.out.println(result);
    }
}	