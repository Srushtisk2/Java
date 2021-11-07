class TestDiamonds
{
	public static void main(String []sru)
	{
		Diamonds.price();
		Diamonds cutting = new Diamonds();
		boolean soft = cutting.material();
		System.out.println(soft);
	}
}