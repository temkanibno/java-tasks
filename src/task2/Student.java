package task2;

public class Student {
    private String name;

    private String studentNumber;

    private Teacher[] teachers = new Teacher[5];

    private int teachersIndex = 0;

    public Student(String name, String studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public void addTeacher(Teacher teacher){
        teachers[teachersIndex] = teacher;
        teachersIndex++;
    }

    public String toString(){
        return "Student name is: "+name+", Student student number is:"+studentNumber;
    }

    public void printTeachersInformation(){
        for (int i = 0; i<teachersIndex; i++){
            System.out.println(teachers[i].toString());
        }
    }
}
