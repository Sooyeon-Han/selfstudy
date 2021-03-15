package java_bible.ch05;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];	//score[0]을 max(배열 최대값을 의미)로 설정
		int min = score[0];	//score[0]을 min(배열 최소값을 의미)로 설정

		for(int i=1; i<score.length; i++) {
			if(score[i]>max) {
				max=score[i];
				//score[1]부터 score[6]까지 max와 차례로 비교하면서 max보다 값이 크면 max를 그 값으로 변경
			}else if(score[i]<min) {
				min=score[i];
				//score[1]부터 score[6]까지 min과 차례로 비교하면서 min보다 값이 작으면 min을 그 값으로 변경
			}
		}
		
		System.out.println("배열의 최대값 : " + max);
		System.out.println("배열의 최소값 : " + min);
	}

}
