package java_bible.ch07;

public class ex22 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv1());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}
