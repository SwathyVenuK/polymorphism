package polymorphism;

import java.util.Scanner;

public class Case2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the Telephone Bill Number");
		int a1=s.nextInt();
		System.out.println("Enter the Customer Name");
		String a2=s.next();
		System.out.println("Enter the Number of Calls made");
		int a3=s.nextInt();
		System.out.println("Enter the Cost per Call ");
		int a4=s.nextInt();
	
		System.out.println("Enter the Tcurrent Bill Number");
		int b1=s.nextInt();
		System.out.println("Enter the Customer Name");
		String b2=s.next();
		System.out.println("Enter the Number of units consumed");
		int b3=s.nextInt();
		System.out.println("Enter the Cost per unit ");
		int b4=s.nextInt();
		Bill b=new Bill();
		b.generatebill(a1,a2);
		Tbill t=new Tbill();
		t.generatebill(a1,a2,a3,a4);
		Cbill d=new Cbill();
		d.generatebill(b1,b2,b3,b4);
	}

}
class Bill{
	private int b1;
	private String b2;

	public void generatebill(int a1, String a2) {
		// TODO Auto-generated method stub
		
	}
	
}
class Tbill{
	private  int a3;
	private double a4;

	public void generatebill(int a1, String a2, int a3, double a4) {
	System.out.println("phone Bill number:"+a1);
	System.out.println("Name:"+a2);
	double amount1=a3*a4;
	System.out.println("phone Bill amount:"+amount1);	
	}
	
}
class Cbill{
private int b3;
private double b4;
	public void generatebill(int b1, String b2, int b3, double b4) {
		System.out.println(" current Bill number:"+b1);
		System.out.println("Name:"+b2);
		double amount2=b3*b4;
		System.out.println("current Bill amount:"+amount2);	
		
	}
	
}

