package 繼承練習;

public class Teacher extends Person {
	private String teaching;
	
    public Teacher(String name, String rank) {
        super(name, 0); // 呼叫父類別的建構函式
        this.setRank(rank); // 設定 rank
        this.teaching = teaching;
    }
    
    public void teach() {
        System.out.println("教書");
    }
    /*
    public String getRank() {
    	return rank;
    }
    */
    public String getTeaching() {
    	return teaching;
    }
}
