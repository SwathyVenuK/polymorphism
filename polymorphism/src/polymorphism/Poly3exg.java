package polymorphism;

import java.util.Scanner;

public class Poly3exg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Shoping n=new Shoping();
		System.out.println("Enter the name");
        String n1=s.next();
		System.out.println("Enter the address");
		 String a=s.next();
		System.out.println("Enter the contact number");
		int co=s.nextInt();
		System.out.println("Enter the email");
		 String e=s.next();
		 n.display1(n1,a,co,e);
		 System.out.println("\nnumber of items");
		 int item=s.nextInt();
		 
//	
		 System.out.println("\nEnter the number of sarees");
		 int item1=s.nextInt();
		 System.out.println("\nEnter the number of churidhaar");
		 int item2=s.nextInt();
		 System.out.println("\nEnter the number of pants");
		 int item3=s.nextInt();
		 int total=0;
		 n.display1( item,item1,item2,item3,total);
		
	}

}
class Shoping{

	public void display1(String n1, String a, int co, String e) {

		System.out.print("\nname:"+n1);
		System.out.print("\naddress:"+a);
		System.out.print("\nphone number:"+co);
		System.out.print("\nemail:"+e);
		
	}
	public void display1(int item,int item1,int item2,int item3,int total)
	{
		 System.out.println("\nsarees:"+item1);
		 System.out.println("\nchuridhar:"+item2);
		 System.out.println("\npants:"+item1);
		
		 if(item1!=0)
		 {
			 item1=item1*200;
		 }
		 else if(item2!=0)
		 {
			 item2=item2*250;
		 }
		 else if(item3!=0)
		 {
			 item3=item3*150;
		 }
		 else
		 {
			System.out.println("Thank you for visiting");
		 }
		 total=item1+item2+item3;
		 System.out.println("\ntotal amount is:"+total);
		 System.out.println("\nThank you");
	}
	
}
