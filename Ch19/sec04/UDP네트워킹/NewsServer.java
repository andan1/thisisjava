package Ch19.sec04.UDP네트워킹;

import java.net.*;
import java.util.*;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;
	
	public static void main(String[] args) throws Exception {
		System.out.println("-------------------------------------------");
		System.out.println("서버를 종료하려면 q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("-------------------------------------------");
		
		// UDP 서버 시작
		startServer();
		
		// 키보드 입력
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String key = scanner.nextLine();
			if (key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		
		// TCP 서버 종료
		stopServer();
	}
	
	public static void startServer() {
		// 작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					// DatagramSocket 생성 및 Port 바인딩
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[서버] 시작됨");
					
					while (true) {
						// 클라이언트가 구독하고 싶은 뉴스 주제 얻기
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						datagramSocket.receive(receivePacket);
						String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
						
						// 클라이언트의 IP와 Port 얻기
						SocketAddress socketAddress = receivePacket.getSocketAddress();
						
						// 10개의 뉴스를 클라이언트로 전송
						for (int i = 1; i <= 10; i++) {
							String data = newsKind + " : 뉴스" + i;
							byte[] bytes = data.getBytes("UTF-8");
							DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
							datagramSocket.send(sendPacket);
						}
					}
				} catch (Exception e) {
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};
		// 스레드 시작
		thread.start();
	}
	
	public static void stopServer() {
		// DatagramSocket을 닫고 Port 언바인딩
		datagramSocket.close();
		System.out.println("[서버] 종료됨");
	}

}
// UDP 서버
// UDP 서버를 위한 DatagramSocket 객체를 생성할 때에는 다음과 같이 바인딩할 Port 번호를 생성자 매개값으로 제공해야 함

// UDP : 발신자가 일방적으로 수신자에게 데이터를 보내는 방식
// 연결 요청 및 수락 과정이 없기 때문에 TCP보다 데이터 전송 속도가 상대적으로 빠름