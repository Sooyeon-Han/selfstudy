package java_bible.ch09;

public class Point implements Cloneable {
	
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return  "x="+x+", y="+y;
	}
	
//	public Object clone() {
//		Object obj = null;
//		try {
//			obj = super.clone();	//clone()은 반드시 예외처리를 해주어야한다
//		} catch (CloneNotSupportedException e) {
//			// TODO: handle exception
//			return obj;
//		}
//	}
}
