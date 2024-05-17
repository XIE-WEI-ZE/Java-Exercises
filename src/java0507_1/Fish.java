package java0507_1;

public class Fish extends Animal
implements Swimmer{
	
	@Override
	public void 呼吸() {
		System.out.println("用鰓呼吸");
	}

	@Override
	public void swim() {
		// TODO 自動產生的方法 Stub
		System.out.println("魚在游泳");
	}
	
}
