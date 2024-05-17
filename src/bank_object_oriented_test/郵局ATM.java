package bank_object_oriented_test;

//實現郵局ATM
public class 郵局ATM extends 基本ATM {
	public 郵局ATM() {
	super(0);
	}
	
	@Override
	public String 銀行名稱() {
		return "郵局";
	}
	
}
