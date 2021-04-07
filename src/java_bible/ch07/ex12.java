package java_bible.ch07;

class Card1{
	final int NUMBER;	
	final String KIND;	//상수이지만 선언과 함께 초기화하지 않고 생성자에서 단 한번만 초기화 할 수 있음.
	static int width=100;
	static int height=250;
	
	Card1(String kind, int num){
		KIND = kind;
		NUMBER = num;	//매개변수로 넘겨받은 값으로 KIND, NUMBER 초기화
	}
	
	Card1(){
		this("HEART",1);
	}
	
	public String toString() {
		return KIND + " "+NUMBER;
	}
}


public class ex12 {
	public static void main(String[] args) {
		Card1 c = new Card1("HEART",10);
//		c.Number = 5;		에러 : cannot assign a value for final variable NUMBER
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);	//System.out.println(c.toString();
	}
}
