package socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Socket socket = new Socket(ip,port number);
		try {
			String ip = InetAddress.getLocalHost().getHostAddress();//자신의 컴퓨터주소
			Socket socket = new Socket();//connect안하고 Socket("192.168.10.51",12345);
			socket.connect(new InetSocketAddress(ip, 12345));
			System.out.println("연결성공!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
