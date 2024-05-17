package bank_object_oriented_test;

//具體玉山銀行卡的實現
public class 玉山銀行提款卡 extends 提款卡 {
	@Override
	public String 銀行名稱() {
		return "玉山銀行";
	}
	@Override
	public void printWelcome() {
		System.out.println("歡迎光臨玉山銀行");
	}
}
