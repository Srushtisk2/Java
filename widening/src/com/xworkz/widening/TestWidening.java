package com.xworkz.widening;

import com.xworkz.widening.dto.Widening;
public class TestWidening {

	public static void main(String[] args) {
		Widening widening = new Widening();
		
		//Converting from byte;
		System.out.println("Byte to short " +widening.a+ " "+widening.b);
		System.out.println("Byte to int " +widening.x+ " "+widening.y);
		System.out.println("Byte to long " +widening.x1+ " "+widening.y1);
		System.out.println("Byte to float " +widening.x2+ " "+widening.y2);
		System.out.println("Byte to double " +widening.x3+ " "+widening.y3);
		System.out.println("Byte to boolean " +widening.a+ " "+widening.x4);
		
		System.out.println();
		
		//Converting from short;
		System.out.println("Short to int " +widening.c+ " "+widening.d);
		System.out.println("Short to long" +widening.c1+ " "+widening.d1);
		System.out.println("Short to float " +widening.c2+ " "+widening.d2);
		System.out.println("Short to double " +widening.c3+ " "+widening.d3);
		System.out.println("Short to boolean " +widening.c+ " "+widening.d4);
		
		System.out.println();
		
		//converting from char;
		System.out.println("char to int " +widening.r+ " "+widening.s);
		System.out.println("char to long " +widening.r1+ " "+widening.s1);
		System.out.println("char to float " +widening.r2+ " "+widening.s2);
		System.out.println("char to double " +widening.r3+ " "+widening.s3);
		System.out.println("char to boolean " +widening.r1+" " +widening.r2+ " "+widening.r4);
		
		System.out.println();
		
		//converting from integer;
		System.out.println("int to long " +widening.i+ " "+widening.i);
		System.out.println("int to float " +widening.ii+ " "+widening.j1);
		System.out.println("int to double " +widening.iw+ " "+widening.j2);
		System.out.println("int to boolean " +widening.i+" " +widening.j1+ " "+widening.i3);
		
		System.out.println();
		
		//converting from long;
		System.out.println("long to float " +widening.m+ " "+widening.n);
		System.out.println("long to double " +widening.m1+ " "+widening.n1);
		System.out.println("long to boolean " +widening.m+ " "+widening.n+ " "+widening.m2);
		
		System.out.println();
		//converting from float;
		System.out.println("float to double " +widening.rv+ " "+widening.rv1);
		System.out.println("float to boolean " +widening.rv+ " "+widening.rv1+ " "+widening.res);
	}

}
