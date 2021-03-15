package java_bible.ch05;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] score = new int [5];
		 int a=1;
		 
		 score[0]=50;
		 score[1]=60;
		 score[a+1]=70;
		 score[3]=80;
		 score[4]=90;
		 
		 int tmp = score[a+2] + score[4];
		 
		 for(int i=0; i<5;i++) {
			 System.out.println("score["+i+"] : "+score[i]);
		 }
		 
		 System.out.println("tmp : " + tmp);
		 System.out.println(score[7]);
	}

}
