package java_bible.ch04;

public class FlowEx30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sum=0;
		
		while(true) {
			if(sum>100)
				break;
			sum+=++i;
		}
		System.out.println("i="+i);
		System.out.println("sum="+sum);
	}

}
