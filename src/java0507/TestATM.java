package java0507;

public class TestATM {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		郵局ATM atm = new 郵局ATM();
		//繼承
		//提款卡 cardddd = new 郵局提款卡();
		//因為資料型別是提款卡，而非維澤銀行提款卡，所以不能使用它有的功能
		//提款卡 cardddd = new 維澤提款卡();
		//cardddd.printBanana();
		維澤提款卡 cardddd = new 維澤提款卡();
		cardddd.printBanana();	
		atm.提款(cardddd,5000);
		//多型:以先祖類別表示子類別的時候會有兩個特性
		//1.只能使用別組類別所具有的功能(方法)
		//2.使用功能(方法)實，會椅子孫類別實現的方法執行(複寫)
	}

}
