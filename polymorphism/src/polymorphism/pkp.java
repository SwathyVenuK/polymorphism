package polymorphism;

import java.util.*;
class pkp
{
  public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
    
    int b1;int b2;int b3;
    
    Calories g=new Calories();
     System.out.println("1)Bread only2)bread+jam3)bread+jam+Butter");
    System.out.println("Enter the choice");
    int n=s.nextInt();
    switch(n)
    {
      case 1:
        {
          System.out.println("Enter the number of Slice of bread");
          int a1=s.nextInt();
           g.calculateCalories(a1);
          break;
        }
      case 2:
        {
            System.out.println("Enter the number of Slice of bread");
            int a2=s.nextInt();
            System.out.println("Enter the number of teaspoon of Jam");
            int a3=s.nextInt();
          g.calculateCalories(a2,a3);
          break;
        }
      case 3:
        {   
        	 System.out.println("Enter the number of Slice of bread");
        	    b1=s.nextInt();
        	      System.out.println("Enter the number of teaspoon of Jam");
        	    b2=s.nextInt();
        	      System.out.println("Enter the number of teaspoon of Butter");
        	    b3=s.nextInt();
      g.calculateCalories(b1,b2,b3);
          break;
        }
}
  }
}
class Calories{
  public void calculateCalories(int a1){
      
    double w1=a1*74;
    double w2=w1*4.1868;
    System.out.printf("%.3f kJ of energy generated from %.3f calories",w2,w1);
  }
  public void calculateCalories(int c1,int c2){
       
      double w3=(c1*74)*(c2*26);
    double w4=w3*4.1868;
    System.out.printf(".3f kJ of energy generated from %.3f calories",w4,w3);
   }
  public void calculateCalories(int b1,int b2,double b3){
	  double w3;
	  double w4;
    w3=(b1*74)*(b2*26)*(b3*102);
    w4=w3*4.1868;
    System.out.printf("%.3f kJ of energy generated from %.3f calories",w4,w3);
  }

}
