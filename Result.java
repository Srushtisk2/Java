class Result{
	
	public static void main(String []marks){
		
		for(int mark = 0; mark< marks.length; mark++)
		{
			String cgpa = marks[mark];
			
			double per = Double.parseDouble(cgpa);
			System.out.print(per +"\t");
			
			int percentage = Integer.parseInt(cgpa);
			System.out.print(percentage +"\t");
			
			byte perc = Byte.parseByte(cgpa);
			System.out.print(perc +"\t");
			
			short perce = Short.parseShort(cgpa);
			System.out.print(perce +"\t");
			
			float pr = Float.parseFloat(cgpa);
			System.out.print(pr +"\t");
			
			long percen = Long.parseLong(cgpa);
			System.out.print(percen +"\t");
			
			boolean pcn = Boolean.parseBoolean(cgpa);
			System.out.print(pcn +"\t");
			
		}
	}
}