package java_bible.ch07;

public class ex18 {

}

class Parent0{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child0 extends Parent0{
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}