package com.A;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {
	LinkedList first=new LinkedList();
	first.add(10);
	first.add(24);
	first.add(11);
	first.add(12);
    first.add(22);
    first.add(13);
    LinkedList second=new LinkedList(first);
    System.out.println(first);
    //second.add(21);
    //second.add(22);
    //second.add(23);
    //second.add(24);
    //second.add(24);
 // second.addAll(first);
  System.out.println(second);//addAll method Collection Interface
   //second.addAll(2,first);   //addAll method of List Inerface
   //System.out.println(second);
 //System.out.println(second.get(2)); 
 //first.set(2, 77);
// System.out.println(first);
//second.add(2,36);
System.out.println(second);
second.remove(3);
System.out.println(second);
System.out.println(first.indexOf(22));
System.out.println(second.lastIndexOf(24));
List t=first.subList(1, 4);
System.out.println(t);
  

	}
}
