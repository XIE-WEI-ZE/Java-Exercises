package bank_object_oriented_test;

//實現玉山銀行ATM
public class 玉山銀行ATM extends 基本ATM {
	public 玉山銀行ATM() {
		super(15);
	}
	
	@Override
    public String 銀行名稱() {
		return "玉山銀行";
	}
	
	@Override
	public void 提款(提款卡 card, int 金額) {
		//使用提款方法
		super.提款(card, 金額);
		if(card.銀行名稱().equals(this.銀行名稱())) {
			printWelfare();
		}
	} 
	
	public void printWelfare() {
		System.out.println("由於今天是本行創立10周年，5/8~5/23來本銀行定存享有最高7%優存");
	}
}
