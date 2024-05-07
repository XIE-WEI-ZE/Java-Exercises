package 單利測試;

public class SigDemo {
	//單例漠視 ->實例
	private static SigDemo instance = null;
	private SigDemo() {
		
	}
	
	public static SigDemo createSigDemo() {
		if(instance == null) {
			instance = new SigDemo();
		}
		return instance;
	}
}
