package arrays;

public class ArraysTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = new String[3];
		//arr[0], arr[1], arr[2]
		//자동 초기화합니다.
		System.out.println("배열이 만든 변수 개수: " + arr.length);
		
		String ar1,ar2,ar3;//초기화해서 사용해야합니다.
		System.out.println(arr[0]);//null나옴 자동초기화 heap메모리할당은 기본값을가집니다 참조입니다~
	
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);//초과시 ArrayIndexOutOfBoundsException
			System.out.println("글자수 출력: "+ arr[i].length() );//null이라서 길이없어서 오류남
		}

	}

}