package com.javatraing.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetEx {
public static void main(String[] args) {
	
	Set<String>hs =new HashSet<>();
	hs.add("apple");
	hs.add("ball");
	hs.add("monkey");
	hs.add(null);
	hs.add(null);
	hs.add("apple"); //capacity is 16
	
	System.out.println(hs);
	
	Set<Integer>hs1 =new TreeSet<>();
	hs1.add(10);
	hs1.add(20);
	hs1.add(60);
	hs1.add(40);
	hs1.add(50); // it maintains insertion order
	
	System.out.println(hs1);
	
	
	
}	
}
