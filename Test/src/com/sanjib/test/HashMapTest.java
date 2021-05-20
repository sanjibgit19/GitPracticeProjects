package com.sanjib.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		 
		HashMap<Student, Depertment> stuHashMap= new HashMap<>();
		
		stuHashMap.put(new Student("Sanjib"), new Depertment("Employee"));
		stuHashMap.put(new Student("Rajib"), new Depertment("HR"));
		stuHashMap.put(new Student("Raju"), new Depertment("clerk"));
		
		Set s=stuHashMap.entrySet();
		
		Iterator itr=s.iterator();
		while (itr.hasNext()) {
			
			
			Map.Entry m = (Map.Entry) itr.next();
			
			System.out.println("key= "+m.getKey()+" value= "+m.getValue());
			
		}//while()
		
		
	}//main())

}//class
