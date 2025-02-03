package scanner;

import java.util.Scanner;

public class LoopTest02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int number = in.nextInt();
		if(number<0) {
			System.out.println("음수");
		}
		else {
			for(int i=1; i<=number; i++) {
				if(i%2==0)
				System.out.print(i+" ");
			}
		}
		
		in.close();

	}

}
