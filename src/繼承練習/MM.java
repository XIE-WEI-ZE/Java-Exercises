package 繼承練習;

import java.lang.runtime.ObjectMethods;

public class MM extends Department{
	public MM(Teacher teacher, Student student) {
		super("商船學系",teacher,student);
}

	public void response3() {
		System.out.println("一日跑船，終身ㄏㄏ");
	}

}
