package 繼承練習;


public class Student extends Person {
    public Student(String name, int grade) {
        super(name, grade);
    }

    public void study() {
        System.out.println("上課");
    }
    

}