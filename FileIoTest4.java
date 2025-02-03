package fileIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIoTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="./test.dat";
		try (FileReader fr = new FileReader(fileName)){
			char[] buffer = new char[1024];
			while(true) {
			int raedCount = fr.read(buffer);
			if(raedCount==-1)break;
			System.out.println(new String(buffer,0,raedCount));
			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않아요");
		}//nullpointerException 발생가능 이것은 runtime exception으로 컴파일러가 자동체크X
 catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽지 못했습니다.");
		}
			
	}

}
