package java_bible.ch07;

class A{
	public void methodA(B b) {
		b.methodB();
	}
}

class B{
	public void methodB() {
		System.out.println("methodB()");
	}
}

public class ex27 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new B());
	}
}
