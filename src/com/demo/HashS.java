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
		
		set.stream().forEach(x->System.out.println(x));
	}

}
