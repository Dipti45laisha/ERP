package com.A;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveCommon {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5 };
		int[] y = { 2, 3, 4, 6, 7 };
		// System.out.println("x: "+Arrays.toString(x));
		// ystem.out.println("y : "+Arrays.toString(y));
		ArrayList<Integer> t = new ArrayList<Integer>(x.length);
		for (int i : x) {
			t.add(i);
		}
		ArrayList<Integer> p = new ArrayList<Integer>(y.length);
		for (int i : y) {
			p.add(i);
		}
		p.removeAll(t);
		System.out.println(p);
	}
}
