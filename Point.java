package classDiagram;

public class Point {
	// - /기호로는 ㅁ
	private int x;
	private int y;
	//~ /세모
	int z;
	//#/마름모
	protected int a;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static double getPi() {
		return PI;
	}

	// + =public(기호로는 O)
	public static final double PI=3.141592;
}
