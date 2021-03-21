package java_bible.ch05;

public class ArrayEx10 {
	public static void main(String[] args) {
		
		int [] numArr = new int [10];
		
		for(int i=0; i<numArr.length;i++) {
			System.out.print(numArr[i] = (int)(Math.random()*10)); //배열에 0~9 사이의 숫자를 랜덤으로 채우고 그 배열 출력
		}
		System.out.println("");
		System.out.println("####정렬####");
		
		for(int i=0; i<numArr.length; i++) {
			boolean changed = false;	//자리 바꿈이 발생했는지 확인하기 위해
			
			for(int j=0; j<numArr.length-1-i;j++) {
				if(numArr[j]>numArr[j+1]) {
					//옆의 값이 작으면 자리를 바꾼다
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;//자리 바꿈이 생겼으니 changed를 true로
				}
			}
			if(!changed) break;	//자리 바꿈이 없으면 반복문 종료
			for(int k=0;k<numArr.length;k++)
				System.out.print(numArr[k]); //정렬 결과 출력
			System.out.println();
		}
	}

}
