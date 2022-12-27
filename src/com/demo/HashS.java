package com.demo;

import java.util.HashSet;
import java.util.Set;

public class HashS {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("lila");
		set.add("vasant");
		set.add("Veena");
		set.add("Nihal");
		
		for(String s: set) {
			System.out.println(s);
		}	}

}
