package task3;

public class Student {

    private String name;

    private String studentNumber;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public void printInformation(){
        System.out.println("Student name is: "+name+", Student student number is:"+studentNumber);
    }
}
