package java0506_1;

//public final class A{
public class A {
	public int publicInt = 10;
	// public final int publicInt = 10;
	protected int protectedInt = 20;
	int defaultInt = 30;
	private int privateInt = 40;
	public static int banana = 123;
	
	
	static {
		//static blick 本類別被載入時執行(只執行一次)
		//類別初始化 優先權最高
		System.out.println("hello class");
	}
	
	{
		// 此block 類別被讀取時執行
		// 物件初始化(全建構子共通)
		publicInt = 10;
		//block 本類別的物件被建立時
		System.out.println("hello");
	}

	
	
	
	
	
	
	public A(int publicInt, int protectedInt, int defaultInt, int privateInt) {
		super();
		this.publicInt = publicInt;
		this.protectedInt = protectedInt;
		this.defaultInt = defaultInt;
		this.privateInt = privateInt;
	}

	public A() {
		System.out.println("hello2");
	}

	// public final void test(){
	public void test() {
		System.out.println(publicInt);
		System.out.println(protectedInt);
		System.out.println(defaultInt);
		System.out.println(privateInt);
	}
	public static void main(String[] args) {
		//靜態
		
		A a = new A();
		banana = 123;
		//a.test();
		}

	/**
	 * @return publicInt
	 */
	public int getPublicInt() {
		return publicInt;
	}

	/**
	 * @param publicInt 要設定的 publicInt
	 */
	public void setPublicInt(int publicInt) {
		this.publicInt = publicInt;
	}

	/**
	 * @return protectedInt
	 */
	public int getProtectedInt() {
		return protectedInt;
	}

	/**
	 * @param protectedInt 要設定的 protectedInt
	 */
	public void setProtectedInt(int protectedInt) {
		this.protectedInt = protectedInt;
	}

	/**
	 * @return defaultInt
	 */
	public int getDefaultInt() {
		return defaultInt;
	}

	/**
	 * @param defaultInt 要設定的 defaultInt
	 */
	public void setDefaultInt(int defaultInt) {
		this.defaultInt = defaultInt;
	}

	/**
	 * @return privateInt
	 */
	public int getPrivateInt() {
		return privateInt;
	}

	/**
	 * @param privateInt 要設定的 privateInt
	 */
	public void setPrivateInt(int privateInt) {
		this.privateInt = privateInt;
	}

	/**
	 * @return banana
	 */
	public static int getBanana() {
		return banana;
	}

	/**
	 * @param banana 要設定的 banana
	 */
	public static void setBanana(int banana) {
		A.banana = banana;
	}
	}
