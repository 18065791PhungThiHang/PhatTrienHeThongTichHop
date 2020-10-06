package lab3;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PhanLoaiDCIP {
	public static void main(String[] args) {
		try {
			if(args.length!=1) {
				System.out.println("Cach su dung: java TimDCIp <hostname>");
	
			}
			InetAddress host=InetAddress.getByName("www.facebook.com");
			String hostName=host.getHostName();
			System.out.println("Hosst name:"+hostName);
			System.out.println("Dia Chi IP:"+host.getHostAddress());
			byte[] b=host.getAddress();
			int i=b[0]>0?b[0]:256+b[0];
			if((i>=1)&(i<=126))
				System.out.println(host+ " \tthuoc dia chi lop A");
			if((i<=191)&(i>=128))
				System.out.println(host+ " \tthuoc dia chi lop B");
			if((i<=223)&(i>=192))
				System.out.println(host+ " \tthuoc dia chi lop C");
		}
		catch(UnknownHostException e){
			System.out.println("khong tim thay dia chi");
			return;
		}
	}

}
