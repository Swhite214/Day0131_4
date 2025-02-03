package arrays;

import java.util.Scanner;

class Student{
	String name;
	int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
}
public class ArrayTest02 {

	public static void main(String[] args) {
		
		Student student = new Student("박찬우",48);
		System.out.println("이름: "+ student.name+", 학년: " + student.grade);
		
		Student[] stds=new Student[3];
		//stds[0]=null, stds[1]=null, stds[2]=null
		Scanner in = new Scanner(System.in);
		for(int i=0; i< stds.length; i++) {
			String n = in.nextLine();
			//int grade = in.nextInt(); 이런문장이있다면 반드시 엔터를 제거해야합니다
			//in.nextLine();
			stds[i] = new Student(n,i);//반드시 초기화 문장이있어야합니다 배열은
			//제발좀 기억합시다 금붕어도 아니고 배열만 나오면 왜이리 맥을 못추리냐
		}
		for(int i = 0; i < stds.length; i++) {//nullpointerException,범위나가면 OutofBounds
			System.out.println("이름은: "+stds[i].name);
			System.out.println("grade: "+ stds[i].grade);
		}
		
	}

}
