package java_bible.ch05;

public class ArrayEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String src = "ABCDE";
		
		for(int i=0; i<src.length();i++) {
			char ch = src.charAt(i);	//src의 i번째 문자를 ch에 저장
			System.out.println("src.charAt("+i+") : " + ch);
		}
		char [] chArr = src.toCharArray();	//String을 char로 변환
		/*
		# String <--> char
		char [] chArr = {'A','B','C','D'}
		String str = new String(chArr);		char배열을 String으로
		char [] tmp = str.toCharArray();	String을 char 배열로	
		 */
		System.out.println(chArr);
		
	}

}
