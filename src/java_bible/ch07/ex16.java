package java_bible.ch07;

public class ex16 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;
		fe.drive();	//컴파일은 되지만 실행 시 에러발생
		car2 = fe;
		car2.drive();
	}
}

