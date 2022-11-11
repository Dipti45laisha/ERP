package com.A;

import java.util.ArrayList;
import java.util.Collection;

public class Sample {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(3.14f);
		al.add('c');
		al.add("Hello");
		al.add(true);
		al.add(10);
		al.add(342563214);
	
		al.add(10);
		al.add(10);
		al.add(10);
		//al.clear();
     	//al.contains(20);
		al.remove((Object)10);              //remove first occurance
		//al.remove((Object)10);
		//al.toArray(object(al));
		Object[] x=al.toArray();
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains(20));
		System.out.println(al.add(30));
		System.out.println(al);
		
		
	}

	}

