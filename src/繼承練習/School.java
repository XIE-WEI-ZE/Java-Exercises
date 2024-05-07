package 繼承練習;

public class School {
	private String name;
	private String type;
	private int fee;
	
	public School(String name, String type, int fee) {
		this.name = name;
		this.type = type;
		this.fee = fee;
	}
	
		
	public void information() {
		System.out.println("校名:"+name);
		System.out.println("類型:"+type);
		System.out.println("費用:"+fee);
	}
}
