package polymorphism;

import java.util.Scanner;




public class Polystudent {

	private static final String String = null;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student4 c=new Student4();
		System.out.println("Enter the name");
        String n=s.next();
		System.out.println("Enter the address");
		 String a=s.next();
		System.out.println("Enter the contact number");
		int co=s.nextInt();
		System.out.println("Enter the email");
		 String e=s.next();
		System.out.println("Enter the proof type");
		String pty=s.next();
		System.out.println("Enter the proof id");
		int pid=s.nextInt();
		c.display(n,a,co,e,pty,pid);
		System.out.println("\nEnter the mars for sub1");
        int a1=s.nextInt();
        System.out.println("\nEnter the mars for sub2");
        int a2=s.nextInt();
        System.out.println("\nEnter the mars for sub3");
        int a3=s.nextInt();
        System.out.println("\nEnter the mars for sub4");
        int a4=s.nextInt();
        System.out.println("\nEnter the mars for sub5");
        int a5=s.nextInt();
        System.out.println("\nEnter the mars for sub6");
        int a6=s.nextInt();
        int total=0;
        
        c.display(a1,a2,a3,a4,a5,a6, total);
		
	    	}

}
class Student4{

	public void display(String n,String a,int co,String e,String pty,int pid) {

		System.out.print("\nname:"+n);
		System.out.print("\naddress:"+a);
		System.out.print("\nphone number:"+co);
		System.out.print("\nemail:"+e);
		System.out.print("\nproof type:"+pty);
		System.out.print("\nproof id"+pid);
		

	}

	public void display(int a1, int a2, int a3, int a4, int a5, int a6,int total) {
		System.out.print("\n"+a1);
		System.out.print("\n"+a2);
		System.out.print("\n"+a3);
		System.out.print("\n"+a4);
		System.out.print("\n"+a5);
		System.out.print("\n"+a6);
		total=a1+a2+a3+a4+a5+a6;
		System.out.print("\n"+total);
		if(total>450)
		{
			System.out.print("\n1s1 rank\t");
		}
		else if(total>400&&total>=450)
		{
			System.out.print("\n2nd rank\t");
		}
		else if(total>350&&total>=400)
		{
			System.out.print("\n3nd rank\t");
		}
		else if(total>300&&total>=350)
		{
			System.out.print("\n4th rank\t");
		}
		else
		{
			System.out.print("\nfailed\t");
		}
	}
	
	
	
	
	
}
