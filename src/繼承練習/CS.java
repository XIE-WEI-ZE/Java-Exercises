package 繼承練習;

public class CS extends Department {
    public CS(Teacher teacher, Student student) {
        super("資訊工程學系", teacher, student);
    }
    
    public void response2() {
        System.out.println("一日資工，終身汁男");
    }
}
