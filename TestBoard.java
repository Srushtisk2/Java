class TestBoard
{
	public static void main(String []sru)
	{
		Board.name();
		Board brd = new Board();
		boolean currentclr = brd.colour();
		System.out.println(currentclr);
	}
}