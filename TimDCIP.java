package lab3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TimDCIP {
	public static void main(String[] args) {
		try {
			InetAddress hosth = InetAddress.getByName("www.facebook.com");
			String hostName=hosth.getHostName();
			System.out.println("Host name:"+hosth);
			System.out.println("Dia chi IP:"+hosth.getHostAddress());
		}catch(UnknownHostException e) {
			System.out.println("khong tim thay dia chi");
			return;
		}
	}

}
