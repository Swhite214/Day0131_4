package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest2 {

	public static void main(String[] args) {
		//파일입출력,바이트기반(byte기반 -InputStream),텍스트기반(char기반 - Reader/Writer)
		//FileOutputStream fos;
		//FileWriter fw;
		//FileInputStream fis;
		//FileReader fr;
		String fileName="./test.dat"; //상대 or 절대경로
		FileWriter fw=null;//반드시초기화
		try {
			fw = new FileWriter(fileName,true); //예외가 발생하면 fw초기화가 안될수있음
			//파일이 존재하지 않으면 자동 생성시켜줍니다.
			fw.write(65);
			fw.write('a');
			fw.write("가나다라\n");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//fw.close(); try블록안에있는 지역변수fw는 여기서 접근이 불가능합니다.
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
