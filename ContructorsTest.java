package contructors;

class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Point(int x) {//오버로딩입니다 오버로딩이란? 메서드나생성자의 이름의 중복을 허용하는 문법으로 매개변수의 갯수등으로 구별합니다.
		this(x,x);//오버로딩은 리턴값하고는 상관없습니다 오로지 데이터타입과 갯수가 달라야합니다
		//String aaa String data이것도 안됩니다 aaa랑 data는 같은 데이터타입이기때문에
	}
	
}


public class ContructorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(1,2);
		System.out.println(p.x);
	}

}
