package socket;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server2 {
	
	public static void main(String[] args) {
	while(true) {	
		try (ServerSocket serverSocket = new ServerSocket(12345)){//0.0.0.0 모든 네트워크에서 접근이 가능, 내부,외부에서 접근이 가능
			System.out.println("server start");
			Socket client = serverSocket.accept();
			InetSocketAddress ia =(InetSocketAddress)client.getRemoteSocketAddress();//연결된 클라이언트의 정보
			System.out.println("address:"+ia.getAddress());//
			System.out.println("HostName:"+ ia.getHostName());
			System.out.println("PortNumber:"+ ia.getPort());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}//while
	}//main
}
