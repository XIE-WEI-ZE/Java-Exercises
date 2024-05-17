package bank_object_oriented_test;

//定義抽象類
public abstract class 基本ATM {
	int 手續費;
	//創手續費
	public 基本ATM(int 手續費) {
		this.手續費 = 手續費;
	}
	//提款方法
	public void 提款(提款卡 card,int 金額) {
		if(card.銀行名稱().equals(this.銀行名稱())) {
			手續費 = 0;			
			System.out.println("因使用["+card.銀行名稱()+"]提款卡,所以收取手續費 "+手續費+"元");
		}
		else {
			手續費 = 15;
			System.out.println("因使用["+card.銀行名稱()+"]提款卡, 所以收取手續費 "+手續費+"元");			
		}
		int 餘額 = card.查詢餘額();
		if(餘額<金額+手續費) {
			System.out.println("餘額不足，提款失敗");
			return;
		}
		餘額-=(金額+手續費);
		card.設置餘額(餘額);
		System.out.println("提款成功，提取金額為: "+金額+"元，手續費: "+手續費+"元");
	} 
	//存款方法
	public void 存款(提款卡 card, int 金額) {
		if(card.銀行名稱().equals(this.銀行名稱())){
			手續費 = 0;
			System.out.println("因使用["+card.銀行名稱()+"]提款卡,所以收取手續費 "+手續費+"元");
		}
		else {
			手續費 = 25;
			System.out.println("因使用["+card.銀行名稱()+"]提款卡, 所以收取手續費 "+手續費+"元");
		}
		int 餘額 = card.查詢餘額();
		if(餘額<手續費) {
			card.設置餘額(餘額);
			System.out.println("餘額不足，存款失敗");
			return;
		}
		餘額+=(金額-手續費);
		card.設置餘額(餘額);
		System.out.println("存款成功，存入金額為: "+金額+"元，手續費: "+手續費+"元");		
	} 
	
	public abstract String 銀行名稱();
}
