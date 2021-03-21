package java_bible.ch05;

public class ArrayEx11 {
	public static void main(String[] args) {
		int [] numArr = new int[10];
		int [] counter = new int[10];
		
		for(int i=0; i<numArr.length;i++) {
			numArr[i]=(int)(Math.random()*10);//0~9 사이의 임의의 수를 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<numArr.length;i++) {
			counter[numArr[i]]++; 
			//numArr[i]의 값이 예를 들어 3이라면 counter[3]에 1을 추가 -> 이런 식으로 numArr에 숫자가 몇 번 들어갔는지 확인 가능
		}
		for(int i=0; i<numArr.length;i++) {
			System.out.println(i+"의 개수 : " + counter[i]);
		}
	}
}
