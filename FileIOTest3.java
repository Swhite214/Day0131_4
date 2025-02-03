package fileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest3 {

	public static void main(String[] args) {
		//파일입출력,바이트기반(byte기반 -InputStream),텍스트기반(char기반 - Reader/Writer)
		//FileOutputStream fos;
		//FileWriter fw;
		//FileInputStream fis;
		//FileReader fr;
		String fileName="./test.dat"; //상대 or 절대경로
		//반드시초기화
		try (FileWriter fw=new FileWriter(fileName,true);){//autoclose가 되어있는 친구만 가능합니다
			 //예외가 발생하면 fw초기화가 안될수있음
			//파일이 존재하지 않으면 자동 생성시켜줍니다.
			fw.write(65);
			fw.write('a');
			fw.write("가나다라\n");
			//fw.flush(); auto closing하면서 자동으로 flush도 해줌 flush가없다면 닫을때 버퍼안에있는애들도 소멸함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
