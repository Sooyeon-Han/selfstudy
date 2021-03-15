package java_bible.ch05;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] abc = { 'A', 'B', 'C', 'D'};
		char [] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 합쳐서 하나의 배열(result)로 만든다
		char [] result = new char[abc.length+num.length];
		//새로운 배열 result의 길이는 배열 abc의 길이와 num의 길이를 더한 값과 같게 설정
		System.arraycopy(abc, 0, result, 0, abc.length);
		//abc의 [0]에서 result[0]으로 abc.lenght개의 데이터 복사
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//배열 abc를 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//number의 인덱스 6 위치에 abc 3개 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}

}
