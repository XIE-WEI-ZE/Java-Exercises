package 繼承練習;



public class NTOU{
	private String name;
	private String type;
	private int fee = 25000;
	private int grand;
	/**
	 * @return name
	 */
	
	public NTOU(String name, String type, int fee) {
		this.name = name;
		this.type = type;
		this.fee = fee;
	}
	
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
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type 要設定的 type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return fee
	 */
	public int getFee() {
		return fee;
	}
	/**
	 * @param fee 要設定的 fee
	 */
	public void setFee(int fee) {
		this.fee = fee;
	}

	/**
	 * @return grand
	 */
	public int getGrand() {
		return grand;
	}

	/**
	 * @param grand 要設定的 grand
	 */
	public void setGrand(int grand) {
		this.grand = grand;
	}
	
}