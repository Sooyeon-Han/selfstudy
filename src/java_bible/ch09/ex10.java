package java_bible.ch09;

public class ex10 {
	public static void main(String[] args) {
		Card c = new Card("HEART", 3);
		//Card c2 = Card.class.newInstance();	//Class 객체를 통해 객체를 생성
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		//System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}
}
