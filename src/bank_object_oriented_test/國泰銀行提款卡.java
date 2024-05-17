package bank_object_oriented_test;

//具體國泰銀行提款卡的實現
public class 國泰銀行提款卡 extends 提款卡 {
	@Override
	public String 銀行名稱() {
		return "國泰銀行";
	}
	@Override
	public void printWelcome() {
        System.out.println("歡迎光臨國泰銀行");
    }
	
}
