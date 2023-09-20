package org.aravindh.AravindhPoject;

public class SampleClass {
	
	public void method1() {
		System.out.println("1");

	}
public static void main(String[] args) {
	String s="aravindh";
	String rev=" ";
	for (int i =s.length()-1; i>=0; i--) {
		char charAt = s.charAt(i);
		rev=rev+charAt;
		}
	System.out.println(rev);
}
}
