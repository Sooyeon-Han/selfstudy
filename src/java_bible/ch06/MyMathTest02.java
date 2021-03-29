package java_bible.ch06;

public class MyMathTest02 {
	public static void main(String[] args) {
		//클래스 메서드 호출. 인스턴스 생성없이 호출 가능
		System.out.println(MyMath02.add(200L,100L));
		System.out.println(MyMath02.subtract(200L,100L));
		System.out.println(MyMath02.multiply(200L,100L));
		System.out.println(MyMath02.divide(200L,100L));
		
		MyMath02 mm = new MyMath02();
		mm.a = 200L;
		mm.b = 100L;
		//인스턴스 메서드는 객체생성 후에만 호출 가능
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
