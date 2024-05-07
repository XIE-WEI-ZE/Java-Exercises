package java0506;

public class Dogmain {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		//Dog dog = new Dog("Lucky",-30);
		Dog dog = new Dog();
		//不可行，因為name已經被封裝起來，變成私有
		//dog.name = "A";
		dog.setName("A");
		System.out.println(dog.getName());
		//dog.setWeigth(20);
		//dog.setWeigth(-6);
		System.out.println("一共消費了共:"+dog.getWeigth()*3+"元");
		
		Gwawa gwawa = new Gwawa();
		gwawa.setName("吉祥");
		gwawa.setWeigth(100);
		gwawa.set眼睛凸出距離(30);
		System.out.println(gwawa.getWeigth());
		System.out.println(gwawa.getName());
		System.out.println("gwawa眼睛凸出距離"+gwawa.get眼睛凸出距離());
		gwawa.鑽小洞();
		gwawa.test叫();
		//dog.叫();
		
	}

}
