package polymorphism;

public class Overidingsuperkey {

	public static void main(String[] args) {
		Dem obj=new Dem();
		obj.disp();

	}

}
class Abc1{
	public void disp() {
		System.out.println("parent class");
	}
}
class Dem extends Abc1{	
	public void disp() {
		super.disp();
		System.out.println("child  class");
		super.disp();
	}
	
}
