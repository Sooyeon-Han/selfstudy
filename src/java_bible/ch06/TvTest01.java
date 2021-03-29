package java_bible.ch06;

public class TvTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t;
		t = new Tv();
		t.channel = 7;
		System.out.println("현재 채널은 "+t.channel+"번 입니다.");
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+"번 입니다.");

	}

}
