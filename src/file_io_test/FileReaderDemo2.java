package file_io_test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderDemo2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("C:\\Java\\banana.txt");
			InputStreamReader isr = new InputStreamReader(fis,"MS950");
			BufferedReader br = new BufferedReader(isr)){
			String data ="";
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
