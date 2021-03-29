package java_bible.ch06;

public class BlockTest01 {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("static { }");
	}
	
	public BlockTest01() {
		System.out.println("생성자");
	}
	
	private void mian() {
		// TODO Auto-generated method stub
		System.out.println("BlockTest01 bt = new BlockTest01();");
		BlockTest01 vt = new BlockTest01();
		
		System.out.println("BlockTest01 bt2 = new BlockTest01();");
		BlockTest01 b2 = new BlockTest01();
	}
}
