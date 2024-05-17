package file_io_test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.FileWriter;
public class WriterDemo {

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("C:/Java/balabala.txt");
             //MS950 是一種用於繁體中文的字符編碼。
        	 OutputStreamWriter osw = new OutputStreamWriter(fos, "MS950");
             BufferedWriter bw = new BufferedWriter(osw)) {
            bw.write("hello" + "\n");
            // 將緩衝區中的資料強制寫入到底層流中
            bw.flush();
            System.out.println("ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
