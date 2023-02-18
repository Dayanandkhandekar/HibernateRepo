package com.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class MapDemo {
  public static void main(String[] args) {
	  NavigableDemo.m1();
	  
	  System.exit(0);
	  Student11 s1=new Student11(1, "AA");
	  Student11 s2=new Student11(2, "BB");
	  Student11 s3=new Student11(3, "CC");
	  List<Student11> lists=new ArrayList<>();
	    lists.add(s1);
	    lists.add(s2);
	    lists.add(s3);
	    
		System.out.println("Before Sort========"+lists);
		
		Collections.sort(lists, new StudentId());
		System.out.println("After Sort========"+lists);
		Comparator<Student11>  c=new Comparator<Student11>() {

			@Override
			public int compare(Student11 o1, Student11 o2) {
				// TODO Auto-generated method stub
				return  o1.getSname().compareTo(o2.getSname());
			}
			
		};
		Collections.sort(lists,c);
		System.out.println("After Sort name========"+lists);
		
	  SortedSet<Integer> sset=new TreeSet<Integer>();
		
	  sset.add(10);
	  sset.add(10);
	  sset.add(20);
	  sset.add(30);
	  sset.add(40);
		System.out.println("sset========"+sset);
		System.out.println("sset========"+sset.first());
		System.out.println("sset========"+sset.last());
		System.out.println("sset========"+sset.headSet(20));
		System.out.println("sset========"+sset.tailSet(20));
		System.out.println("sset========"+sset.subSet(10, 20));
	  
		
		
		
	 
	  
	Set<Integer> set=new HashSet<Integer>();
	Set<Integer> set1=new LinkedHashSet<Integer>();
	set.add(10);
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	System.out.println("Befor set========"+set);
	List<Integer> list=new ArrayList<Integer>(set1);
	Collections.sort(list, new Abc());
	System.out.println("After Sort========"+set);
	 
	set1.add(10);
	set1.add(10);
	set1.add(20);
	set1.add(30);
	set1.add(40);
	System.out.println("set1========"+set1);
	
	Map<Integer,String> map=new HashMap();
	Map<Integer,String>  map1=new LinkedHashMap();
	
	map.put(10,"Abc");
	map.put(10,"Xyz");
	map.put(20,"aa");
	map.put(30,"hh");
	map.put(40,"yy");//  add the object in map
	System.out.println("map========"+map);
	
	map1.put(10,"abc");
	map1.put(10,"nn");
	map1.put(20,"ll");
	map1.put(30,"oo");
	map1.put(40,"yy");
	System.out.println("map1========"+map1);
	
}
}

class Abc implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return (o2-o1);
	}
	
}

class StudentId implements Comparator<Student11>{

	@Override
	public int compare(Student11 o1, Student11 o2) {
		// TODO Auto-generated method stub
		return -(o1.getId()-o2.getId());
	}
	
}

class Student11 {
	
	int id;
	String sname;
	public Student11(int id, String sname) {
		super();
		this.id = id;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}

class NavigableDemo {
	
	static void m1() {
		NavigableSet<Integer> set=new TreeSet<Integer>();
	
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println("Befor set========"+set);
		System.out.println("poll First ========"+set.pollFirst());
		System.out.println("poll last ========"+set.pollLast());
		System.out.println("lower========"+set.lower(20));
		System.out.println("floor set========"+set.floor(20));
		System.out.println("Befor set========"+set);
	}
}