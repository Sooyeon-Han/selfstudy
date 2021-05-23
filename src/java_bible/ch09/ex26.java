package java_bible.ch09;

import java.util.Arrays;
import java.util.Objects;

public class ex26 {
	public static void main(String[] args) {
		String [][] str2D = new String [][] {{"aaa","bbb"},{"AAA","BBB"}};
		String [][] str2D_2 = new String [][] {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.print("str2D = {");
		
		for(String [] tmp : str2D)
			System.out.print(Arrays.toString(tmp));
		System.out.print("}");
		
		System.out.println("equals(str2D, str2D_2) = )"+Objects.equals(str2D, str2D_2));
		System.out.println("deepEquals(str2D, str2D_2) = )"+Objects.deepEquals(str2D, str2D_2));
		//System.out.println("isNull(null) ="+isNull(null));
	}
}
