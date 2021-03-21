package java_bible.ch05;

import java.util.Arrays;

public class ArrayEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] code = {-4,-1,3,6,11};
			int [] arr = new int[10];
			
			for(int i=0; i<arr.length; i++) {
				int tmp = (int)(Math.random()*code.length);	//tmp에 0~4 사이의 숫자가 랜덤하게 저장됨
				arr[i] = code[tmp];
			}
			
			System.out.println(Arrays.toString(arr));//Arrays.toString(배열 출력)
			
	}

}
