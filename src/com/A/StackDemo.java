package com.A;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("10 is located at"+" "+s.search(10)+ " "+"Offset");
	
		//System.out.println("Befor pop"+s);
		System.out.println("Befor Peek"+s);
		Object t=s.peek();
		System.out.println("After peek"+s);
		System.out.println("peek returned"+t);
		Object t1=s.pop();
		
		System.out.println("After pop"+s);
		System.out.println("Removed"+ " "  +(Integer)t1 +" "+"From The Top");
		
		
	
		
	}

}
