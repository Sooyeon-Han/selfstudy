package java_bible.ch04;

public class FlowEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i \t2*i \t2*i-1 \ti*i \tll-i \ti%3 \ti/3");
		System.out.println("===================================================");
		
		for(int i=1; i<=10;i++) {
			System.out.println(i + "\t" + 2*i+ "\t" + (2*i-1)+ "\t" + (i*i)+ "\t" + (11-i)+ "\t" + i%3+ "\t" +i/3 );
		}
	}

}
