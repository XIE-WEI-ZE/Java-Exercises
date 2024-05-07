package java0507;

public class TestATM {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		郵局ATM atm = new 郵局ATM();
		//繼承
		//提款卡 cardddd = new 郵局提款卡();
		//提款卡 cardddd = new 維澤提款卡();
		//因為資料型別是提款卡，而非維澤銀行提款卡，所以不能使用它有的功能
		//cardddd.printBanana();
		維澤提款卡 cardddd = new 維澤提款卡();
		cardddd.printBanana();	
		atm.提款(cardddd,5000);
	}

}
