package java_bible.ch04;

public class FlowEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==j) {
					System.out.print("["+i+","+j+"]");
				} else {
					System.out.print("     ");
				}
			}System.out.println();
		}
	}

}
