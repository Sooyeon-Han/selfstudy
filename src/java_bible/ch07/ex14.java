package java_bible.ch07;

final class Singleton {
	private static Singleton s = new Singleton();

	private Singleton() {
		// ...
	}

	public static Singleton getInstance() {
		if (s == null)
			s = new Singleton();

		return s;
	}
}

public class ex14 {
	public static void main(String[] args) {
		// Singleton s = new Singleton();
		// Singleton s = new Singleton.getInstacne();
	}
}
