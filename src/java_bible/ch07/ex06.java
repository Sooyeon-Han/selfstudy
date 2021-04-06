package java_bible.ch07;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childen c = new Childen();
		c.method();
	}

}

class Parents{
	int x = 10;
}

class Childen extends Parents{
	int x = 20;
	
	void method() {
		System.out.println("X = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = "+super.x);
	}
}
