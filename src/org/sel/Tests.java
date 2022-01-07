package org.sel;

public class Tests {
	public static void main(String[] args) {
		
	
	String a = "ganesh";
	String b ="sanjay";
	String c = "Kumar";
	System.out.println("a="+System.identityHashCode(a));
	System.out.println("b="+System.identityHashCode(b));
	System.out.println("c="+System.identityHashCode(c));
	
	StringBuffer concat1 = new StringBuffer (a);
	System.out.println("concat1="+System.identityHashCode(concat1));
	StringBuffer concat2 = new StringBuffer (b);;
	System.out.println("concat2="+System.identityHashCode(concat2));
	StringBuffer concat3 = new StringBuffer (c);
	System.out.println("concat3="+System.identityHashCode(concat3));
	StringBuffer ap = concat1.append(concat2);
	System.out.println(System.identityHashCode(ap));
	StringBuffer ap1 = concat2.append(concat3);
	System.out.println(System.identityHashCode(ap1));
	StringBuffer ap2 = concat3.append(concat1);
	System.out.println(System.identityHashCode(ap2));
	
	}
}
