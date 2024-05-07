package java0507;
//就像老師是抽象的描述
public abstract class 提款卡 {
	private int 餘額 = 10000;
	//抽象
	public abstract String 銀行名稱(); 
	public int 查詢餘額() {
		return 餘額;
	}
	public void 設置餘額(int 計算後金額) {
		this.餘額 = 計算後金額;
	}
	
}
