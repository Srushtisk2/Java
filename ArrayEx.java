package com.xworkz.arrayEx;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx {
	
	public static void main(String[] args) {
		
		int num[] = {2,4,6,8,10,24,12,48};
		 
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		 System.out.println();
		 System.out.println("sort method");
		 Arrays.sort(num);
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		 System.out.println();
		 System.out.println("filling the array");
		 Arrays.fill(num, 24);
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		System.out.println();
		 System.out.println("using math operator");
		 double[] doub =new double[5];
	 
			 Scanner scanner= new Scanner(System.in);
			 for (int j = 0; j < doub.length; j++) {
				 doub[j]=scanner.nextDouble();
                System.out.println(doub[j]);
				
			}
			
		}
	}


