package java_bible.ch06;

public class MyMath02 {
	long a;
	long b;
	
	//인스턴스 변수 a, b만을 이용해 작업하므로 매개변수가 필요 없음
	long add() {return a+b;}
	long subtract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	//인스턴스 변수와 관계 없이 매개변수만으로 작업 가능
	static long add(long a, long b) {return a+b;}	//a, b는 지역변수
	static long subtract(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(double a, double b) {return a/b;}
}
