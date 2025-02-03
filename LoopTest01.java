package scanner;

import java.util.Scanner;

public class LoopTest01 {

	public void test() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("영문자 하나만이 이 루프를 끝낼수있습니다.");
			String sad = in.next();
			System.out.println("틀렸습니다. 다시시도해보세요");
			if(sad.equals("q")||sad.equals("Q")) {
				System.out.println("정답입니다~");
				break;
			}
			System.out.println(sad);
		}
	}
	public static void main(String[] args) {
		LoopTest01 obj = new LoopTest01();
		obj.test();
	}//while true인지 확인 2. true라면 그다음 문장 결코 도달불가이므로 확인하기 equals인지 아닌지확인하기
 //;위치 잘보기
}
