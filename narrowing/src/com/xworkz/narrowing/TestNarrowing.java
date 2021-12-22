package com.xworkz.narrowing;

import com.xworkz.narrowing.dto.Narrowing;
public class TestNarrowing {

	public static void main(String[] args) {
		
		Narrowing narrowing = new Narrowing();
		
		//converting from double;
		System.out.println("Double to float " +narrowing.a+ " " +narrowing.b);
		System.out.println("Double to long " +narrowing.a1+ " " +narrowing.b1);
		System.out.println("Double to int " +narrowing.a2+ " " +narrowing.b2);
		System.out.println("Double to char " +narrowing.a3+ " " +narrowing.b3);
		System.out.println("Double to short " +narrowing.a4+ " " +narrowing.b4);
		System.out.println("Double to byte " +narrowing.a5+ " " +narrowing.b5);
		
		System.out.println();
		
		//converting from float;
		System.out.println("float to long " +narrowing.c+ " " +narrowing.d);
		System.out.println("float to int " +narrowing.c1+ " " +narrowing.d1);
		System.out.println("float to char " +narrowing.c2+ " " +narrowing.d2);
		System.out.println("float to short " +narrowing.c3+ " " +narrowing.d3);
		System.out.println("float to byte " +narrowing.c4+ " " +narrowing.d4);
		
		System.out.println();
		
		//converting from long;
		System.out.println("long to float " +narrowing.e+ " " +narrowing.f);
		System.out.println("long to double " +narrowing.e1+ " " +narrowing.f1);
		System.out.println("long to int " +narrowing.e2+ " " +narrowing.f2);
		System.out.println("long to char " +narrowing.e3+ " " +narrowing.f3);
		System.out.println("long to short " +narrowing.e4+ " " +narrowing.f4);
		System.out.println("long to byte " +narrowing.e5+ " " +narrowing.f5);
		
		System.out.println();
		
		//converting from integer;
		System.out.println("long to double " +narrowing.m+ " " +narrowing.n);
		System.out.println("long to float " +narrowing.m1+ " " +narrowing.n1);
		System.out.println("long to long " +narrowing.m2+ " " +narrowing.n2);
		System.out.println("long to char " +narrowing.m3+ " " +narrowing.n3);
		System.out.println("long to short " +narrowing.m4+ " " +narrowing.n4);
		System.out.println("long to byte " +narrowing.m5+ " " +narrowing.n5);
		System.out.println("Integer to integer "+narrowing.mm);

		System.out.println();
		
		//converting from char;
		System.out.println("char to double " +narrowing.x+ " " +narrowing.y);
		System.out.println("char to float " +narrowing.x1+ " " +narrowing.y1);
		System.out.println("char to long " +narrowing.x2+ " " +narrowing.y2);
		System.out.println("char to int " +narrowing.x3+ " " +narrowing.y3);
		System.out.println("char to short " +narrowing.x4+ " " +narrowing.y4);
		System.out.println("char to byte " +narrowing.x5+ " " +narrowing.y5);
		
        System.out.println();
		
		//converting from short;
		System.out.println("short to double " +narrowing.i+ " " +narrowing.j);
		System.out.println("short to float " +narrowing.i1+ " " +narrowing.j1);
		System.out.println("short to long " +narrowing.i2+ " " +narrowing.j2);
		System.out.println("short to int " +narrowing.i3+ " " +narrowing.j3);
		System.out.println("short to char " +narrowing.i4+ " " +narrowing.j4);
		System.out.println("short to byte " +narrowing.i5+ " " +narrowing.j5);
		
		System.out.println();
		
		//converting from byte;
		System.out.println("byte to double " +narrowing.p+ " " +narrowing.q);
		System.out.println("byte to float " +narrowing.p1+ " " +narrowing.q1);
		System.out.println("byte to long " +narrowing.p2+ " " +narrowing.q2);
		System.out.println("byte to int " +narrowing.p3+ " " +narrowing.q3);
		System.out.println("byte to char " +narrowing.p4+ " " +narrowing.q4);
		System.out.println("byte to short " +narrowing.p5+ " " +narrowing.q5);
	}

}
