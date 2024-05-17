package file_io_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main() {
		long st = System.currentTimeMillis();
		FileInputStream fis = null;
		try {
			// 取得目前時間的毫秒數。
			fis = new FileInputStream("C:/Java/test2.txt");
			int i = 0;
			int count = 0;
			// 等於-1為做到底
			while ((i = fis.read()) != -1) {
				// 算出0~255之間的數字
				count++;
			}
			System.out.println("共有 " + count + " Bytes");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("找不到檔案");
			// 檔案再但可能有加密不能讀寫的情況
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 當try做完 還有其他事情要做 可以先放這邊
			if (fis != null) {
				try {
					fis.close();
					System.out.println("檔案已關閉");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			long et = System.currentTimeMillis();
			System.out.println("------------" + (et - st));
		}

	}
}
