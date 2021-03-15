package java_bible.ch05;

public class ArrayEx08 {
	public static void main(String[] args) {
		int [] ball = new int[45];	//크기가 45인 배열
		
		//배열의 각 요소에 1부터 45까지 저장
		for(int i=0; i<ball.length; i++)
			ball[i] = i+1;	//ball[0]에 1, ball[1]에 2 저장
		
		int temp = 0;	//두 값을 바꾸는데 사용될 임시변수
		int j = 0;		//임의의 값을 얻어서 저장할 변수
		
		//배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔 섞는다
		//0부터 5번째 요소까지 모두 6개만 바꾼다
		for(int i=0; i<6; i++) {
			j=(int)(Math.random()*45);	//0~44 범위의 임의의 값을 얻음
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
			//ball[i]와 ball[j]의 값을 바꿈
		}
		//배열 ball의 앞에서부터 6개의 요소 출력
		for(int i=0;i<6;i++)
			System.out.println("ball["+i+"] = "+ball[i]);
		
	}
}
