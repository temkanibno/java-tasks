package task3;

public class Team {
    private String name;
    private Student[] students = new Student[5];

    private int studentsIndex = 0;
    public Team(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students[studentsIndex] = student;
        studentsIndex++;
    }

    public void printInformation(){
        System.out.println("Team name is:"+name);
        System.out.println("Team members are");
        for (int i = 0; i<studentsIndex;i++){
            students[i].printInformation();
        }
    }

}
