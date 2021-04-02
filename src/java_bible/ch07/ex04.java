package java_bible.ch07;

class VCR{
	boolean power;
	int counter = 0;
	void power() {power = !power;}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

public class ex04 extends Tv {
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}
