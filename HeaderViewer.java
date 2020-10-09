package IPAddress;
import java.net.*;
import java.io.*;
import java.util.*;
public class HeaderViewer {
	 public static void main(String args[]) {
		 for (int i=0; i < args.length; i++) {
		 try {
			 URL u = new URL(args[i]);
			 URLConnection uc = u.openConnection( );
			 System.out.println("Content-type: " + uc.getContentType( ));
			 System.out.println("Contentencoding: " + uc.getContentEncoding( ));
			 System.out.println("Date: " + new Date(uc.getDate( )));
			 System.out.println("Last modified: " + new Date(uc.getLastModified()));
			 System.out.println("Expiration date: " + new Date(uc.getExpiration()));
			 System.out.println("Content-length: " + uc.getContentLength( ));
		 }
		
		 catch (MalformedURLException ex) {
			 System.err.println(args[i] + " is not a URL I understand");
		 }
		 catch (IOException ex) {
			 System.err.println(ex);
		 }
		 System.out.println( );
		 }
	 }
}