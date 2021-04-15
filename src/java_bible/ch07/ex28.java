package java_bible.ch07;

class Aa{
	void autoPlay(I i) {
		i.play();
	}
}

interface I{
	public abstract void play();
}

class Bb implements I{
	public void play() {
		System.out.println("play in B class");
	}
}

class C implements I{
	public void play() {
		System.out.println("play in C class");
	}
}

public class ex28 {
	public static void main(String[] args) {
		Aa a = new Aa();
		a.autoPlay(new Bb());	//void autoPlay(I i) 호출
		a.autoPlay(new C());
	}

}
