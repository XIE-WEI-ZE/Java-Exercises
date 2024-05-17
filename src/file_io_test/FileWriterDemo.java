//package java0510;
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//
//public class FileWriterDemo {
//
//	public static void main(String[] args) {
//		try(FileOutputStream fos = new FileInputStream("C:\\Java\\banana.txt");
//				OutputStreamWriter osw = new OutputStreamWriter(fos,"MS950");
//				BufferedReader bw = new BufferedWriter(osw)){
//				bw.write("書名:謝維則"+"\n");
//				bw.flush();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//			}
//
//	}
//
//
package file_io_test;


