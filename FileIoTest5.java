package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class FileIoTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="./test.dat";
		//BufferedReader br; BufferedWriter bw;
		//BufferedInputStream bis; BufferedOutputStream bos; 양방향 통신 채널에서 주로쓰입니다.
		CharBuffer buffer = CharBuffer.allocate(1024);
		try (FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);){//8192
			
			int readCount;
			while((readCount = fr.read(buffer)) != -1) {//-1이면 반복문탈출 read는 읽어온값을 int로변환 아무것도 안읽었다면 -1반환
			buffer.flip();//읽기모드로 전환
			while(buffer.hasRemaining()) {
				System.out.println(buffer.get()); //버퍼에서 문자를 읽기
			}
			buffer.clear(); //버퍼를 비우고 쓰기모드로 전환
			}
		}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않아요");
		}//nullpointerException 발생가능 이것은 runtime exception으로 컴파일러가 자동체크X
 catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽지 못했습니다.");
		}
			
	

	}
}