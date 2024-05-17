package bank_object_oriented_test;

public abstract class 提款卡 {
	private int 餘額 = 5000;
	//抽象
	public abstract String 銀行名稱();
	public abstract void printWelcome();
	public int 查詢餘額() {
		return 餘額;
	}
	public void 設置餘額(int 計算後的金額) {
		this.餘額 = 計算後的金額;
	}
}
