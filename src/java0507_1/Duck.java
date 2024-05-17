package java0507_1;

public class Duck extends Animal 
implements Swimmer{
	private int id;
	
	@Override
	public void 呼吸() {
		System.out.println("吸");
		//Swimmer.super.呼吸();
	}

	@Override
	public void swim() {
		// TODO 自動產生的方法 Stub
		System.out.println("鴨子在游泳");
	}
}
