package java0506;

public class Human {
	private int height;
	private double weight;

	/**
	 * @return height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height 要設定的 height
	 */

	/**
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight 要設定的 weight
	 */
	public void setWeight(double weight) {
		if (weight < 0) {
			System.out.println("體重不能為負數");
			return;
			
		}
		this.weight = weight;
	}

	public void setHeight(int height) {
		if (height < 100 || height >200) {
			System.out.println("身高不能為負數");
			return;
			
		}
		this.height = height;
	}
}
