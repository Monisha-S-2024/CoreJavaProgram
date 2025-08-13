package com.tnsif.comparableinterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tnsif.comparator.Laptop;

public class Demo {
public static void main(String[] args) {
	List<Laptop> laps=new ArrayList<Laptop>();
	
	laps.add(new Laptop("dell" ,15,170000));
	laps.add(new Laptop("lenova" ,12,180000));
	laps.add(new Laptop("Hp" ,15,870000));
	laps.add(new Laptop("apple" ,18,70000));
	
	Collections.sort(laps);
	
	for(Laptop l: laps) {
		System.out.println(l);
		
	}
	
}
}



