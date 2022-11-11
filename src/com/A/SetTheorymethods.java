package com.A;

import java.util.ArrayList;

public class SetTheorymethods {
	public static void main(String[] args) {
		ArrayList first=new ArrayList();
		first.add(10);
		first.add(11);
		first.add(12);
		first.add(13);
	    first.add(14);
	    ArrayList second=new ArrayList();
	    second.add(21);
	    second.add(22);
	    second.add(23);
	    second.add(24);
	    second.add(25);
	    second.add(26);
	    second.addAll(first);
	   
	    System.out.println(second);
	    
	    
}
}