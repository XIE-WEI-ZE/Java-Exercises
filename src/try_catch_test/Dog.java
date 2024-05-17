package try_catch_test;

public class Dog {
	private String name;
	private int weight;
	private int age;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	//表示會發生
	public void setWeight(int weight) throws Exception{
		if(weight < 0) {
			throw new DogException("體重不能為負數");
		}
		this.weight = weight;
	}
}
