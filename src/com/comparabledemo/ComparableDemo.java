package com.comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparableDemo {
   public static void main(String[] args) {
	  
	    MapMethodsDemo a11=new Abc();
	      a11.m2();
	      a11.m3();
	     
	      Abc a21=new Abc();
	      a21.m2();
	  a21.m3();
	  // MapMethodsDemo.mapMethodsDemo();
	   
	   
	  System.exit(0);
	   
	   List<B> listb=new ArrayList<B>();
	     B b1=new B(1, "A", 10);
	     B b2=new B(2, "A", 20);
	     B b3=new B(3, "C", 30);
	     B b4=new B(4, "D", 40);
	     
	   listb.add(b1);
	   listb.add(b2);
	   listb.add(b3);
	   listb.add(b4);
	   
	   System.out.println("Before Sorting==="+listb);
	   SortByd s=new  SortByd();
	   
	   Comparator<B> c=new Comparator<B>() {// on the demand implementation

		@Override
		public int compare(B o1, B o2) {
			// TODO Auto-generated method stub
			return -(o1.getId()-o2.getId());
		}
	};
	   
	   Collections.sort(listb,c);/// list + comparator type cha object
	   System.out.println("After Sorting==="+listb);
	   System.exit(0);
	   
	   
	   List<A>  list=new ArrayList<A>();
	      
	   A a1=new A(1, "AA",10);
	   A a2=new A(2, "AA",20);
	   A a3=new A(3, "BB",30);
	   A a4=new A(4, "CC",40);
	   
	    list.add(a1);
	    list.add(a3);
	    list.add(a2);
	   
	    list.add(a4);
	    System.out.println("Before Sorting list===  "+list);
	    Collections.sort(list);// accept only comparable type che object
	  
	    
	    System.out.println("After Sorting list===  "+list);
	     
}
}

class A  implements Comparable<A>  {
	 
	 int id;
	 String sname;
	 
	  int mark;

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

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "A [id=" + id + ", sname=" + sname + ", mark=" + mark + "]\n";
	}

	public A(int id, String sname, int mark) {
		super();
		this.id = id;
		this.sname = sname;
		this.mark = mark;
	}

	@Override
	public int compareTo(A o) {
	
		//return -(this.getId()-o.getId());
		return  -(this.getSname().compareTo(o.getSname()));
	}
	  
	  
	  
}

class B implements Comparator<B>{
	int id;
	 String sname;
	  int mark;
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
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "B [id=" + id + ", sname=" + sname + ", mark=" + mark + "]\n";
	}
	public B(int id, String sname, int mark) {
		super();
		this.id = id;
		this.sname = sname;
		this.mark = mark;
	}
	@Override
	public int compare(B o1, B o2) {
		// TODO Auto-generated method stub
		return -(o1.getId()-o2.getId());
	}
	  
	  
}

class SortByd implements Comparator<B> {

	@Override
	public int compare(B o1, B o2) {
		
		return -(o1.getId()-o2.getId());
	}
	
	
}

class MapMethodsDemo{
	
	  static  void mapMethodsDemo() {
		   
		   Map<Integer, String>  map=new HashMap<Integer, String>();
		   
		        map.put(10,"Abc");
		        
		            map.put(10,"pqr");// Abc replaced by pqr
		       
		       String ov = map.put(10,"aa");// Abc replaced by pqr
		       
		       System.out.println("ov===="+ov);
		        
		        
		        map.put(20,"Abc1");
		        map.put(30,"Abc2");
		        map.put(40,"Abc3");
		        
		        System.out.println("map===="+map);
		        
		        Map<Integer, String>  map1=new HashMap<Integer, String>(map);
				   
		        map1.put(10,"Abc");
		        map1.put(10,"pqr");
		       map1.putAll(map);
		        
		        System.out.println("map1===="+map1);
		        
		        System.out.println("contains key===="+map.containsKey(40));
		        
		        System.out.println("contains value===="+map.containsValue("Abc"));
		   
		   
	   }
	  
	
	     final void m1() {
	    	 System.out.println("Inside m1 Map");
	     }
	     
	     static void m2() {
	    	 System.out.println("Inside m2 Map");
	     }
	     
	     void m3() {
	    	 System.out.println("Inside m2 Map");
	     }
	    
	
}

class Abc extends MapMethodsDemo {
	   
	     static void m2() {// data hiding 
	    	 System.out.println("Inside m2 Abc");
	     }
	    
	     
	     void m3() {// data ovverriding
	    	 System.out.println("Inside m2 Abc");
	     }
	     
	     //  MapMethodsDemo a1=new Abc();
	     //  a1.m2();
	     //  a1.m3();
	     
	     //  Abc a2=new Abc();
	     //  a2.m2();
	 //  a2.m3();
}
















