package Inheritance;

public class ABInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A superOb = new A();
		B subOb = new B();
		superOb.i=10;
		superOb.j=20;
		System.out.println("Content of superObj:");
		superOb.showij();
		System.out.println();
		
		subOb.i=7;
		subOb.j=8;
		subOb.k=20;
		System.out.println("Content of SubOb:");
		subOb.showij();
		subOb.showk();
		System.out.println();
		System.out.println("Sum of i,j, and k in subOb:");
		subOb.sum();
		
	}

}
