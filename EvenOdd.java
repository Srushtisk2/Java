class EvenOdd{
	public static void main(String sru[]){
	
	
	for(int index=0; index< sru.length; index++){
        String number=sru[index];
        System.out.print(number +"\t");
		
		int n = Integer.parseInt(number);
        System.out.println(n);
		
		short numb = Short.parseShort(number);
        System.out.println(numb);
		
		long nume = Long.parseLong(number);
        System.out.println(nume);
		
		byte nu = Byte.parseByte(number);
        System.out.println(nu);
		
		double numr = Double.parseDouble(number);
        System.out.println(numr);
		
		float numv = Float.parseFloat(number);
        System.out.println(numv);
		
        boolean nums = Boolean.parseBoolean(number);
        System.out.println(nums);
		
         }
     }
}