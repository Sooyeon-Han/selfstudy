package java_bible.ch06;

public class TvTest03 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1의 channel은 "+t1.channel+"번 입니다.");
		System.out.println("t2의 channel은 "+t2.channel+"번 입니다.");
		
		t2 = t1;	//t1ㅇ이 저장하고 있는 값(주소)를 t2에 저장
		t1.channel = 7;
		System.out.println("t1의 channer을 "+t1.channel+"번으로 바꿉니다.");

		System.out.println("t1의 channel은 "+t1.channel+"번 입니다.");
		System.out.println("t2의 channel은 "+t2.channel+"번 입니다.");
		
	}

}
