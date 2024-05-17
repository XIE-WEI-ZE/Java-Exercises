package file_io_test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemowithBuffer {
	public static void main(String[] args) {
		// 開始時間
		long st = System.currentTimeMillis();
		try (FileInputStream fis = new FileInputStream("C:/Java/test2.txt")) {
			//	通過減少 I/O 操作次數和將數據緩存到內存中，顯著提高了讀取效率。
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i = 0;
			int count = 0;
			// 	讀取直到文件末尾
			while ((i = bis.read()) != -1) {
				// 算出0~255之間的數字
				count++;
			}
			System.out.println("共有 " + count + " Bytes");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("找不到檔案");
			// 檔案再但可能有加密不能讀寫的情況
		} catch (IOException e) {
			e.printStackTrace();
			}
		long et = System.currentTimeMillis();
		System.out.println("-------------"+(et-st));
	}
}
