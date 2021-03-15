package java_bible.ch04;

public class FlowEx29 {
	public static void main(String[] args) {
		String s;
		
		for(int i=1; i<=100;i++) {
			System.out.print("i=" + i + " ");
			int j=i;
			do {
				if(j%10%3==0 && j%10!=0)
					System.out.print("짝");
			}while((j/=10)!=0);
			System.out.println();
		}
	}

}
