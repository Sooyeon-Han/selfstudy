package java_bible.ch07;

public class ex23 {
	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		Tv1 tv = new Tv1();
		Computer com = new Computer ();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
