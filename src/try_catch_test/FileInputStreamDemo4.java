package try_catch_test;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileInputStreamDemo4 {
	public static void main(String[] args) {
		long st = System.currentTimeMillis();
		try {
				URL url = new URL("https://api.time.com/wp-content/uploads/2015/02/apple-logo.jpg");
				try(InputStream openStream = url.openStream();
				BufferedInputStream bis = new BufferedInputStream(openStream);
				FileOutputStream fos = new FileOutputStream("C:\\Java/test2.pdf");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
				int i=0;
				while((i=bis.read()) != -1) 
				{
					bos.write(i);
				}
				bos.flush();
			}
		System.out.println("輸出完成");
	} catch(FileNotFoundException e) {
		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
	long et = System.currentTimeMillis();
	System.out.println(et-st);
}
}