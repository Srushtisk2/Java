class TestPendrive
{
	public static void main(String []sru)
	{
		Pendrive.name();
		Pendrive quality = new Pendrive();
		String memory = quality.features();
		System.out.println(memory);
	}
}