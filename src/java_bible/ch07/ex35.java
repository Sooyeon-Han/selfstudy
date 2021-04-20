package java_bible.ch07;

class Outer1{
	int value = 10;	//Outer.this.value
	
	class Inner{
		int value = 20;	//this.value
		
		void method1() {
			int value=30;
			System.out.println("		   value : "+value);
			System.out.println("	  this.value : "+this.value);
			System.out.println("Outer.this.value : "+Outer1.this.value);
		}
	}//Inner class 끝
}//Outer class 긑

public class ex35 {
	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		Outer1.Inner inner = outer.new Inner();
		inner.method1();
	}
}
