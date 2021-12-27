package com.xworkz.exception;

public class ArrayIndexOutOfBounds {
	
	public static void main (String[] args)
	{
		int number[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int num=1;num<number.length;num--)
		{
			System.out.println("natural numbers" +number[num]);
		}
	}

}
