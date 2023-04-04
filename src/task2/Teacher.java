package task2;

public class Teacher {
    private String name;
    private String profession;

    private Student[] students = new Student[20];
    private int studentsIndex = 0;

    public Teacher(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    public void addStudent(Student student) {
        students[studentsIndex] = student;
        studentsIndex++;
    }

    public String toString(){
        return "Teacher name is: "+name+", Teacher profession is:"+profession;
    }

    public void printStudentsInformation(){
        for (int i = 0; i<studentsIndex; i++){
            System.out.println(students[i].toString());
        }
    }

}
