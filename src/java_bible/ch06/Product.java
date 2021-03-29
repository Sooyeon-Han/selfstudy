package java_bible.ch06;

public class Product {
	static int count = 0;	//생성된 인스턴스의 수를 저장하기 위한 변수
	int serialNo;
	
	{
		++count;
		serialNo = count;
	}
	
	public Product() {}	//기본 생성자, 생략 가능
}
