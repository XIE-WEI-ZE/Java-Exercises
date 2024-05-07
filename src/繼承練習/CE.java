package 繼承練習;



public class CE extends Department{ 
	public CE(Teacher teacher, Student student) {
		super("通訊與導航工程學系",teacher,student);
	}
	
	public void response1() {
		System.out.println("一日通訊，終身通訊");
	}

}
