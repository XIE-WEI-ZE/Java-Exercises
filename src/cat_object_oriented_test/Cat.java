package cat_object_oriented_test;

public class Cat {
	//String name;
	protected String name;
	public double weight;
	public int age;
	public String type;
	
	public Cat(String name, double weight, int age, String type) {
	    this.name = name;
	    this.weight = weight;
	    this.age = age;
	    this.type = type;
	}

	/**
	 * @param name 要設定的 name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}


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
		if(weight<0) {
			System.out.println("重新輸入:");
			return;
		}
		this.weight = weight;
	}

	public void 叫聲() {
		System.out.println("喵~屋");
	}

	/**
	 * @param age 要設定的 age
	 */
	public void setAge(int age) {
		if(age<0)
			System.out.print("請重新輸入:");
		this.age = age;
	}
	
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param type 要設定的 type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}

	
}
