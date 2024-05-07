package java0506;




public class Dog {
	//private String name;
	protected String name;
	//String name;
	
	private  int weigth ;
	private int age;
	private String type;
	
	public Dog(String name,int weight) {
		//永遠只能放在第一行，先長核，在長肉
		super();
		this.setName(name);
		this.setWeigth(weight);
	}
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要設定的 name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return weigth
	 */
	public int getWeigth() {
		return weigth;
	}
	/**
	 * @param weigth 要設定的 weigth
	 */
	//weigth 改 w this 可省略
	public void setWeigth(int weigth) {
		if(weigth<0) {
			System.out.println("輸入體重不得小於0");
			return;
		}
		this.weigth = weigth;
	}
	
	public void 叫() {
		System.out.println("狗在叫");
		//reurn 5; 如果友值
	}
	
	//預設建構子，沒有任何參數
	//Dog類別名稱 overloading
	/*
	public Dog() {
		this("小白",60);
	}
	*/
	public Dog() {
		//如果不過就會跳這個
		//this("小白",123);
		//this.setName("Banana");
		//this.setWeigth(123);
	}



}
