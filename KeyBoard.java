class KeyBoard
{
	String name;
	String qwerty;
	short DOB;
	
	KeyBoard(String n)
	{
		name = n;
	}
	
	KeyBoard(String n, String q, short dob )
	{
		name = n;
		qwerty = q;
		DOB = dob;
		
	}
	
	String printAll()
	{
		String display = name + "\t" + qwerty + "\t" + DOB;
		return display;
	}
}
