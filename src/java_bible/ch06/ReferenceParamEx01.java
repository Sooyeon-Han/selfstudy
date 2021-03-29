package java_bible.ch06;

public class ReferenceParamEx01 {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x);
	}
	
	static void change(Data d) {
		d.x=100;
		System.out.println("change() : x = "+d.x);
	}
}
