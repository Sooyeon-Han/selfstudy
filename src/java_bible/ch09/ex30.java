package java_bible.ch09;

public class ex30 {
	
	final static int RECORD_NUM = 10;	//생성할 레코드의 수를 정한다
	final static String TABLE_NAME = "TEST_TABLE";
	final static String [] Code1 = {"010","011","017","018","019"};
	final static String [] Code2 = {"여자","남자"};
	final static String [] Code3 = {"10대","20대","30대","40대","50대"};

	public static void main(String[] args) {
		for(int i=0; i< RECORD_NUM; i++) {
			System.out.println(" INSERT INTO "+TABLE_NAME
					+ " VALUES ("
					+ "'"+getRandArr(Code1) + "'"
					+ ", '"+getRandArr(Code2) + "'"
					+ ", '"+getRandArr(Code3) + "'"
					+ ", "+getRand(100,200)+"); ");
		}
	}
	
	
	public static String getRandArr(String [] arr) {
		return arr [getRand(arr.length)];
	}
	
	public static int getRand(int n) {return getRand(0,n);}
	public static int getRand(int from, int to) {
		return (int)(Math.random()*(Math.abs(to-from)+1))+Math.min(from, to);
	}
}
