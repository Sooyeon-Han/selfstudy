package java_bible.ch07;

public class ex15 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;	//car = (Car)fe;	형변환이 생갸된 형태
//		car.water();	컴파일 에러.. Car 타입의 참조변수로 water()를 호출할 수 없음
		fe2 = (FireEngine)car;	//자손<-조상
		fe2.water();
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrr~");
	}
	
	void stop() {
		System.out.println("STOP!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println(">>water<<");
	}
}
