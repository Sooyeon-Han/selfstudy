package java_bible.ch07;

class Tv1 extends Product{
	Tv1(){
		super(100);	//조상 클래스의 생성자 Product(int price)를 호출. Tv의 가격을 100으로 설정
	}
	public String toString() {return "Tv";}
}