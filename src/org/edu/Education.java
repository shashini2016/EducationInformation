package org.edu;
//*child

public class Education extends Medicine {
	public void ug() {
		System.out.println("ug course:Science&Humanities,");
		
	}
	public void pg() {
		System.out.println("pg course:M.E. Structural Engineering.");
	}
public static void main(String[] args) {
	Education edu = new Education();
	edu.ug();
	edu.pg();
	edu.bsc();
	edu.bEd();
	edu.ba();
	edu.bBA();
	edu.bE();
	edu.bTech();
	edu.physiyo();
	edu.dental();
	edu.mbbs();
}
}
