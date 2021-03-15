package java_bible.ch05;

//0부터 9까지 숫자를 랜덤하게 섞는다
public class ArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numArr = new int[10];
		
		for(int i=0;i<numArr.length; i++) {
			numArr[i] = i;	//배열을 0~9의 숫자로 초기화
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=10; i<100; i++) {
			int n = (int)(Math.random()*10);	//0~9 사이의 한 값을 랜덤하게 받음
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			//numArr[0]과 numArr[n]의 값을 바꾸는 과정
		}
		for(int i=0; i<numArr.length;i++)
			System.out.print(numArr[i]);
	}

}
//숫자는 중복되지 않는다 왜냐하면 애초에 numArr에 중복되는 수가 없기 때문에