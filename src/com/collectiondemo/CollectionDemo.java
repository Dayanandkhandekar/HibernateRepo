package com.collectiondemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
   public static void main(String[] args) {
	  List list=new ArrayList();
	  list.add(10);
	  list.add(10.0);
	  list.add(10.0f);
	  list.add("Abc");
	  list.add('c');
	  
	  List<Integer> list2=new ArrayList<Integer>();
	  list2.add(10);
	  list2.add(20);//1
	  list2.add(40);
	  List<Number> list3=new ArrayList<Number>();
	  list3.add(10);
	  list3.add(10.0);
	  list3.add(10.0f);
	  
	  List<Student> listStudent=new ArrayList<Student>();
	  listStudent.add(new Student(1, "Abc"));
	  listStudent.add(new StudentChild(1, "pqr"));
	  
	 List<Integer> list4=new ArrayList<Integer>(list2);
	// list4.addAll(list2);
	 list4.add(10);
	 list4.add(20);
	 list4.add(30);
	 System.out.println("list4===="+list4);
	 System.out.println("list4===="+list4.size());
	 System.out.println("get==="+list4.get(1));
	  
	 //list2.removeAll(list4);
	 //System.out.println("list2===="+list2);
	// list2.retainAll(list4);
	// System.out.println("list2==="+list2);
	 list2.remove(1);
	 //list2.clear();
	 System.out.println("clear list2==="+list2);
	 
	 Set<Integer> set=new HashSet<Integer>();
		// list4.addAll(list2);
	    set.add(10);
	    set.add(20);
	    set.remove(10);
	    System.out.println("set===="+set);
	    
	    Object[] array = list4.toArray();
	    
	       Iterator<Integer> itr = list4.iterator();
	     
	     Iterator<Student> sitr = listStudent.iterator();
	     while(itr.hasNext()) {
	    	   System.out.println("useing itr==="+itr.next());
	     }
	 
}
}
class Student {
	
	int studentId;
	String studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	
	
	
}
class StudentChild extends Student {

	public StudentChild(int studentId, String studentName) {
		super(studentId, studentName);
		// TODO Auto-generated constructor stub
	}
	
}
