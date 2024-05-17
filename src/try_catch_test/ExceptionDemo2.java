package try_catch_test;

//import javax.swing.JOptionPane;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Dog dog = new Dog();
		//check exception
		//dog.getWeight(100);
		try {
			dog.setWeight(-100);
		} catch (Exception e) {
			//拋出例外
			e.printStackTrace();
			
		}
		//如果輸入的值是<0，那返回的值仍然是原始的初始值，即 0
		System.out.println(dog.getWeight());
	}

}
