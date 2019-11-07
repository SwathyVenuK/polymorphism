package polymorphism;

import java.util.Scanner;

public class Case1poly {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 Ve g=new Ve();
	     System.out.println("1)car2)bike");
	    System.out.println("Enter the choice");
	    int n=s.nextInt();
	    int f=0;
	    switch(n)
	    {
	    case 1:
	    {
	    	 System.out.println("Enter the details of car");
	    	 System.out.println("Enter the colour of car");
	          String a1=s.next();
	          System.out.println("Enter the number of seats  of car");
	          int a2=s.nextInt();
	          System.out.println("Enter the num of wheels of the car");
	          int a3=s.nextInt();
	          System.out.println("Enter the num of doors of the car");
	          int a5=s.nextInt();
	          System.out.println("Enter the maximum speed of car");
	          int a4=s.nextInt();
	          System.out.println("Enter Ac(true/false)");
	           String ac=s.next();
	           if(ac.equals("true"))
	           {
	        	   f=1;
	           }
	           g.display3(a1,a2,a3,a4,ac,a5,f);
	           break;
	    }
	    case 2:
	    {
	    	 System.out.println("Enter the details of car");
	    	 System.out.println("Enter the colour of car");
	          String b1=s.next();
	          System.out.println("Enter the number of seats  of car");
	          int b2=s.nextInt();
	          System.out.println("Enter the num of wheels of the car");
	          int b3=s.nextInt();
	          System.out.println("Enter the num of doors of the car");
	          int b5=s.nextInt();
	          System.out.println("Enter the maximum speed of car");
	          int b4=s.nextInt();
	          System.out.println("Enter the status of disbreak(true/false)");
	           String d1=s.next();
	           if(d1.equals("true"))
	           {
	        	   f=1;
	           }
	           g.display3(b1,b2,b3,b4,d1,b5,f);
	    	break;
	    }
	    
	    }
	}

}
class Ve{


	public void display3(String a1, int a2, int a3, int a4, String ac,int a5,int f) {
		 if(f==1)
		 {
			 System.out.println("True"); 
		 }
		System.out.println("Color:"+a1);
   	 System.out.println("Speed:"+a4);
 	System.out.println("Seats:"+a2);
  	 System.out.println("Wheels"+a3);
	 System.out.println("doors"+a5);
	

		
	}

	public void display3(String b1, int b2, int b3, int b4, String d1,int b5,int f) {
		 if(f==1)
		 {
			 System.out.println("True"); 
		 }
		System.out.println("Color:"+b1);
   	 System.out.println("Speed:"+b4);
 	System.out.println("Seats:"+b2);
  	 System.out.println("Wheels"+b3);
	 System.out.println("doors"+b5);
	

		
	}
	
	
	
}