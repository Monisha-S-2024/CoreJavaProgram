package com.tnsif.collectionframework;

import java.util.ArrayList;

public class Demo {
	public static void main(String[]args) {
		ArrayList l1 =new ArrayList();
		System.out.println(l1.size());
		
		l1.add(l1);
		l1.add("rose");
		l1.add(8.9f);
		l1.add('r');
		
		System.out.println(l1.size());
		System.out.println(l1);
	}
}


