package com.sonata.assignment2;

public class UsingEmployee {

	public static void main(String[] args) {
		Manager m1 = new Manager(91087, "Manager Name", 500);
		Developer d1 = new Developer(22768, "Anirudh B k", 200);
		Tester t1 = new Tester(32562, "Tester Name", 300);
		m1.display();
		d1.display();
		t1.display();
	}
}