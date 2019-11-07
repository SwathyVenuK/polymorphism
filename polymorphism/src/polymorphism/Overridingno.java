package polymorphism;


public class Overridingno {

	public static void main(String[] args) {
		
		Demo obj=new Demo();
			obj.disp();

	}

}
class Abc{
	public void disp() {
		System.out.println("parent class");
	}
}
class Demo extends Abc{	
	public void disp() {
		System.out.println("child  class");
	}
	
}
