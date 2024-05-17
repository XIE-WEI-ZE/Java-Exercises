package file_io_test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("C:\\Java\\banana.txt");
				BufferedReader br = new BufferedReader(fr)){
			String data = "";
			while((data =br.readLine()) != null){
				//每次只讀一行
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO 自動產生的 catch 區塊
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
