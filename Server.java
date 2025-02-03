package socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {
	
	public static void main(String[] args) {
		//서버의 IP
		//TCP/IP 소켓을 사용하여 클라이언트에서 서버로 연결처리하는 프로그램
		
		/*try {
			//InetAddress ia = InetAddress.getLocalHost();
			//System.out.println(ia.getHostAddress());
			String myIp=InetAddress.getLocalHost().getHostAddress();//위아래 동일
			System.out.println(myIp);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try (ServerSocket serverSocket = new ServerSocket(12345)){//0.0.0.0 모든 네트워크에서 접근이 가능, 내부,외부에서 접근이 가능
			Socket client = serverSocket.accept();
			InetSocketAddress ia =(InetSocketAddress)client.getRemoteSocketAddress();
			System.out.println("address:"+ia.getAddress());
			System.out.println("HostName:"+ ia.getHostName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
