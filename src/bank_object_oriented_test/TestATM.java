package bank_object_oriented_test;

import java.util.Scanner;

public class TestATM {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//創建各銀行的atm實例
	玉山銀行ATM esumATM = new 玉山銀行ATM();
	郵局ATM youjuATM = new 郵局ATM();
	//國泰ATM guotaiATM = new 國泰ATM();
	
	//創建不同銀行的提款卡
	玉山銀行提款卡 esumcard =  new 玉山銀行提款卡();
	國泰銀行提款卡 guotaicard = new 國泰銀行提款卡();
	郵局提款卡 youjucard = new 郵局提款卡();
	
	//測試
	System.out.println("------------");
	esumcard.printWelcome();
	System.out.print("請輸入提款金額: ");
	
	//觸發條件
	esumATM.提款(esumcard, sc.nextInt());
	System.out.println("------------");
	esumcard.printWelcome();
	//用玉山銀行提款卡在郵局atm
	esumATM.提款(youjucard, 200);
	System.out.println("------------");
	youjucard.printWelcome();
	youjuATM.提款(esumcard, 200);
	System.out.println("------------");
	//查詢玉山銀行提款卡之餘額
	int 餘額 = esumcard.查詢餘額();
	System.out.println("玉山銀行提款卡餘額: "+餘額+"元");
	System.out.println("------------");
	esumcard.printWelcome();
	//所以他部會做動作
	esumATM.提款(esumcard, 4580);
	System.out.println("------------");
	餘額 = esumcard.查詢餘額();
	System.out.println("玉山銀行提款卡餘額: "+餘額+"元");
	System.out.println("------------");
	esumATM.存款(esumcard, 5);
	餘額 = esumcard.查詢餘額();
	System.out.println("玉山銀行提款卡餘額: "+餘額+"元");
	System.out.println("------------");
	esumcard.printWelcome();
	youjuATM.存款(esumcard,5);
	餘額 = esumcard.查詢餘額();	
	}
}
	

