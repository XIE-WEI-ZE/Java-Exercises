package file_io_test;
//實作介面
public class TestThread implements Runnable {
	String name;
	
	public TestThread(String name) {
        this.name = name;
    }
	
	@Override
    public void run() {
		//2
		Thread thread = Thread.currentThread();
		try {
			//5 使當前執行續暫停一秒
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//3 印出執行序名稱和迭代次數
		for(int i =0;i<1000;i++) {
			System.out.println(thread.getName()+" : "+i);
		}
    }

}
