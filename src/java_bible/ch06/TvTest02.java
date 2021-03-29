package java_bible.ch06;

public class TvTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1 = new Tv();	//Tv t1; t1 = new Tv();를 한 문장에 정리
		Tv t2 = new Tv();
		System.out.println("t1의 channel은 "+t1.channel+"번 입니다.");
		System.out.println("t2의 channel은 "+t2.channel+"번 입니다.");
		
		t1.channel = 7;
		System.out.println("t1의 channer을 "+t1.channel+"번으로 바꿉니다.");

		System.out.println("t1의 channel은 "+t1.channel+"번 입니다.");
		System.out.println("t2의 channel은 "+t2.channel+"번 입니다.");
		
	}

}
