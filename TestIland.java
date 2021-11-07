class TestIland
{
	public static void main(String []sru)
	{
		Iland.name();
		Iland view = new Iland();
		boolean ocean = view.place();
		System.out.println(ocean);
	}
}