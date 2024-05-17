package bank_object_oriented_test;

//具體郵局提款卡的實現
public class 郵局提款卡 extends 提款卡 {
	@Override
	public String 銀行名稱() {
		return "郵局";
	}
	@Override
	public void printWelcome() {
		System.out.println("歡迎光臨郵局");

	}
}
