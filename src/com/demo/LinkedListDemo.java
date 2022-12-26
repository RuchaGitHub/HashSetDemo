package com.demo;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("123");
		list.add("245");
		for(String s: list) {
			System.out.println(s);
		}
	}

}
