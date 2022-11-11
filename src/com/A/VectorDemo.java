package com.A;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector al=new Vector(5,13);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		Vector p=new Vector(al);
		System.out.println(p);
		System.out.println(al.capacity());
		System.out.println(al.size());
		al.addElement(80);
		System.out.println(al);
		al.removeElement(70);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		//al.removeAllElements();
		//System.out.println(al);
		System.out.println(al.elementAt(3));
		System.out.println(al.lastElement());
		System.out.println(al.elements());
	}
}
	

