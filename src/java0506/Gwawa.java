package java0506;

public class Gwawa extends Dog {
	private int 眼睛凸出距離;
	
	
	
	//右鍵->程式碼->利用欄位產生建構子
	public Gwawa(String name, int weight, int 眼睛凸出距離) {
		//只有用super來呼叫dog方法
		super(name, weight);
		this.眼睛凸出距離 = 眼睛凸出距離;
	}
	
	//右鍵->程式碼->從super類別產生建構子
	public Gwawa() {
		//super代表父類別的結構層
		super();
		// TODO 自動產生的建構子 Stub
	}

	public Gwawa(String name, int weight) {
		//在這裡面呼叫Dog()
		super(name, weight);
		// TODO 自動產生的建構子 Stub
	}

	public void 鑽小洞() {
		
		System.out.println(this.getName()+"鑽洞");
	}
	/**
	 * @return 眼睛凸出距離
	 */
	public int get眼睛凸出距離() {
		return 眼睛凸出距離;
	}
	/**
	 * @param 眼睛凸出距離 要設定的 眼睛凸出距離
	 */
	public void set眼睛凸出距離(int 眼睛凸出距離) {
		this.眼睛凸出距離 = 眼睛凸出距離;
	}
	/*
	public void 叫() {
		System.out.println(name+"gwawa在叫");
		super.叫();
	}
	*/
	//你父類別的迴船值也要給
	/*
	@Override 
	//告訴compiler 去覆寫檢查
	public void 叫() {
		//System.out.println(name+"gwawa在叫");
		System.out.println(this.name+"在叫");
		//super.叫();
	}
	*/
	
	public void test叫() {
		叫();
	}


}
