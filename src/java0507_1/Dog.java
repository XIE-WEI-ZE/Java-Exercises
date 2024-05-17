package java0507_1;

public class Dog extends Animal
implements Swimmer{
	@Override
	public void 呼吸() {
		System.out.println("用鼻子呼吸");
	}

	@Override
	public void swim() {
		// TODO 自動產生的方法 Stub
		System.out.println("狗用狗爬式在游泳");
	}
	
	public void 叫() {
		System.out.println("汪汪汪");
	}
}
