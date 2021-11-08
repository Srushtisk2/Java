class MusicalInstrument
{
	String name;
	boolean isTuned;
	boolean isPlaying;
	
	MusicalInstrument(String n)
	{
		name = n;
	}
	
	MusicalInstrument(String n, boolean T, boolean P)
	{
		name = n;
		isTuned = T;
		isPlaying = P;
	}
	
	String printAll()
	{
		String display = name + "\t" + isTuned + "\t" + isPlaying;
		return display;
	}
}

		
	