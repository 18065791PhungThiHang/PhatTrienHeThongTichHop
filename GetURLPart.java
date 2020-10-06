package lab3;

import java.net.MalformedURLException;
import java.net.URL;


public class GetURLPart {
	public static void main(String[] args) {
		try
		{
			URL u=new URL("https://vi-vn.facebook.com/");
			System.out.println("URL is"+u);
			System.out.println("The protocol part is"+u.getProtocol());
			System.out.println("the host part is"+u.getHost());
			System.out.println("the file part is"+u.getFile());
			System.out.println("The reference is"+u.getRef());

		}
		catch(MalformedURLException e)
		{
			System.out.println(e);
		}
	}

}
