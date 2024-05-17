package file_io_test;

public class ThreadTest {

	public static void main(String[] args) {
		// 創建兩個testthread實例
		TestThread tt1 = new TestThread("原神1");
		TestThread tt2 = new TestThread("原神2");
		// 將testthread實例包裝在thread實例中
		Thread t1 = new Thread(tt1);
		//1 設定執行序名稱為"banana"
		t1.setName("Banana"); 
		Thread t2 = new Thread(tt2);
		// 創建其他兩個執行序，使用lambda和匿名類別
		Thread t3 = new Thread(()-> {
			for(int i=0;i<1000;i++) {
                System.out.println("Lamdba"+i);
            }
		});
		
		Thread t4 = new Thread(new Runnable(){
			@Override
			public void run() {
			for(int i=0;i<1000;i++) {
                System.out.println("r1"+i);
            }
			}
		});
		// 啟動t1執行序
		t1.start();
//		t2.start();
		try {
			//4 等待t1執行結束後才會繼續往下執行
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// 啟動t3執行序
		t3.start();
		//6 檢查t1是否仍在執行
		//它可以判斷一個線程是否已經啟動並且尚未終止。
		System.out.println(t1.isAlive());
	}

}
