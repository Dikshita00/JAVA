package com.day5;

public class BookParent {
	private int bid;
	private String bname;
	private Lesson l1;
	class Lesson{
		private int lid;
		private String lname;
		public Lesson() {
				lid=0;
				lname=null;
		}
		public Lesson(int id,String nm) {
			lid=id;
			lname=nm;
		}
		public void m1() {
			System.out.println("In m1 method of lesson");
		}
	}
		public BookParent() {
			bid=0;
			bname=null;
			l1=null;
		}
		public BookParent(int bid, String bname,int lid, String lname) {
			this.bid=bid;
			this.bname=bname;
			this.l1=new Lesson(lid,lname);
		}
		public Lesson getL1() {
			return l1;
		}
		public String toString() {
			return bid+","+bname;
		}
		//main method
		public static void main(String[] args) {
	        BookParent bp = new BookParent(101, "Java Basics", 1, "Introduction");
	        System.out.println("Book Details: " + bp);
	        System.out.println("Lesson Details: " + bp.getL1());
	        bp.getL1().m1();
	    }
}
