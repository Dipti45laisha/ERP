package com.A;

import java.util.ArrayList;

public class Removsecontainretainall {
	public static void main(String[] args) {
		ArrayList first=new ArrayList();
		first.add(21);
		first.add(22);
		first.add(23);
		first.add(24);
	    first.add(25);
	    //ArrayList second=new ArrayList(first);
	    ArrayList second=new ArrayList();
	  second.add(21);
	    second.add(22);
	    second.add(23);
	    second.add(24);
	    second.add(25);
	    second.add(26);
	    second.containsAll(first);
	   
	// second.addAll(first);
	 //  second.addAll(2,first);
	   System.out.println(second);
	// second.removeAll(first);
//	System.out.println(second);
	//System.out.println(second.containsAll(first));
	 //second.retainAll(first);
	 //System.out.println(second);

}
}