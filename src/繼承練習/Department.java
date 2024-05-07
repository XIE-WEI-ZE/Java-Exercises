package 繼承練習;

public class Department{
	private String department;
	private Teacher teacher;
	private Student  student;
	
	public Department(String department,Teacher teacher,Student student) {
		this.department = department;
		this.teacher = teacher;
		this.student = student;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public Teacher getteacher() {
		return teacher;
	}
	
	public void setteacher(Teacher teacher) {
        this.teacher = teacher;
    }
	
	public Student getstudent() {
		return student;
	}
	
	public void setStudent(Student student) {
		this.student = student;
	}
	
}