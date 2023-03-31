package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SutdentUsingCompartor implements Comparable {
	private String studentname;
	private int rollno;
	private int studentage;

	public SutdentUsingCompartor(String studentname, int rollno, int studentage) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.studentage = studentage;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	@Override
	public int compareTo(Object comparestu) {
		int compareage = ((SutdentUsingCompartor) comparestu).getStudentage();
		/* For Ascending order */
		//return this.studentage - compareage;
		/* For Descending order */
		return compareage-this.studentage;

	}

	@Override
	public String toString() {
		return "SutdentUsingCompartor [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage
				+ "]";
	}

	public static void main(String args[]) {

		ArrayList<SutdentUsingCompartor> arraylist = new ArrayList<SutdentUsingCompartor>();
		arraylist.add(new SutdentUsingCompartor("Messi", 222, 29));
		arraylist.add(new SutdentUsingCompartor("Ronaldo", 333, 31));
		arraylist.add(new SutdentUsingCompartor("john", 111, 23));

		Collections.sort(arraylist);

		for (SutdentUsingCompartor str : arraylist) {
			System.out.println(str);
		}
	}
}