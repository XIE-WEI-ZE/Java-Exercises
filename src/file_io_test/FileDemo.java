package file_io_test;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        // 指定文件路徑
        File dir = new File("C:\\Java\\a\\c");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        
        // 指定文件路径，包含文件名
        File file = new File(dir, "test.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getAbsolutePath());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 文件是否存在
        System.out.println("File exists: " + file.exists());

        // 删除文件
//        if (file.exists()) {
//            if (file.delete()) {
//                System.out.println("File deleted: " + file.getAbsolutePath());
//            } else {
//                System.out.println("Failed to delete the file.");
//            }
//        }
    }
}
