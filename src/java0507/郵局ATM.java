package java0507;

public class 郵局ATM {
	int 手續費 = 12;

	public void 提款(提款卡 card, int 金額) {
		//銀行名稱就是一抽象
		if ("郵局".equals(card.銀行名稱())) {
			手續費 = 0;
		}
		int 餘額 = card.查詢餘額();
		if (餘額 < 金額) {
			System.out.println("提款失敗");
			手續費=12;
			return;
		}
		餘額 = 餘額-金額-手續費;
		card.設置餘額(餘額);
		手續費 = 12;
	}
	//一般郵局ATM不能貸款
	public void 轉帳() {
	 }

	public void 查詢餘額() {
	}
}
