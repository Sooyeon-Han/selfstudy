package java_bible.ch06;

public class OverloadingTest {
	public static void main(String[] args) {
		MyMath03 mm = new MyMath03();
		System.out.println("mm.add(3,3) 결과 : " + mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과 : " + mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과 : " + mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과 : " + mm.add(3L,3L));
		
		int [] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}
}
