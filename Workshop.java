class Workshop
{
	String workers;
	int noOfshops;
	int NUM;
	
	Workshop(String w)
	{
		workers = w;
	}
	
	Workshop(String w,int f,int num)
	{
		workers = w;
		noOfshops = f;
		NUM = num;
	}
	
	String printAll()
	{
		String display = workers + "\t" + noOfshops + "\t" + NUM;
		return display;
	}
}
