package java_bible.ch05;

public class ArrayEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "SOSHELP";
		String [] morse = {"・－","－・・・","－・－・","－・・","・"," ・・－・"
							,"－－・","・・・・","・・","・－－－","－・－"," ・－・・"
							,"－－","－・","－－－","・－－・","－－・－","・－・"
							,"・・・","－","・・－","・・・－","・－－","－・・－","－・－－","－－・・"};
		
		String result = "";
		for (int i=0; i<source.length();i++) {
			result += morse[source.charAt(i)-'A'];
			/*
			source를 10진수의 수로 변환
			'A'는 65고 'S'는 83
			source.charAt(0)-'A'는 곧 'S'-'A'가 되고
			즉 83-65, 18이 된다.
			morse 배열에서 index가 18번인(실제로는 19번째) 모스부호를 출력하게 됨
			*/
		}
		System.out.println("source : " + source);
		System.out.println("morse : " + result);
	}

}
