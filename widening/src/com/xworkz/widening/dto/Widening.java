package com.xworkz.widening.dto;

public class Widening {
	//Converting from byte;
public byte a = 2;
public short b = a;

public byte x=65;
public int y= x;

public byte x1=70;
public long y1= x1;

public byte x2=70;
public float y2= x2;

public byte x3=49;
public double y3= x3;

public boolean x4= (a==b);

// Converting from short;
public short c= 3;
public int d = c;

public short c1= 4;
public long d1 = c1;

public short c2= 50;
public float d2 = c2;

public short c3= 30;
public double d3 = c3;

public boolean d4 = (c==d);

//converting from char;
public char r= 'A';
public int s = r;

public char r1= 'b';
public long s1 = r1;

public char r2= 'D';
public float s2 = r2;

public char r3= 'Z';
public double s3 = r3;

public boolean r4= (r1==r2);

//converting from integer;
public int i = 130;
public long j = i;

public int ii = 34;
public float j1 = ii;

public int iw = 67;
public double j2 = iw;

public boolean i3 = (i==j1);

//converting from long;
public long m = 450;
public float n = m;

public long m1 = 47;
public double n1 = m1;

public boolean m2 = (m==n);

//converting from float;
public float rv = 356;
public double rv1 = rv;

public boolean res = (rv!=rv1);

}

