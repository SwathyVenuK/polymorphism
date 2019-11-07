package polymorphism;

import java.util.Scanner;

public class Poly1overloading {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		Add a=new Add();
		a.add(n1);
		a.add(n1,n2);
		a.add(n1,n2,n3);
		
		

	}

}
class Add{

	public void add(int n1) {
		System.out.println("print 1st number:"+n1);
		
	}

	public void add(int n1, int n2, int n3) {
		System.out.println("print 1st number:"+(n1+n2+n3));
		
	}

	public void add(int n1, int n2) {
		System.out.println("print 1st number:"+(n1+n2));
		
	}

	
	
}
