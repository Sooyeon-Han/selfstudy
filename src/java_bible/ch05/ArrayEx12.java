package java_bible.ch05;

public class ArrayEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names [] = {"Kim", "Park", "Yi"};
		
		for(int i=0; i<names.length; i++) 
			System.out.println("names ["+i+"] : " + names[i]);
		
		String tmp = names[2];	//Yi(names[2])를 tmp에 저장
		System.out.println("tmp : "+tmp);
		names[0] = "Yu";	//Kim(names[0])을 Yu로 변경
		
		for(String str : names)	//향상된 for문
			System.out.println(str);
	}

}
