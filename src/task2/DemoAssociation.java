package task2;

public class DemoAssociation {

    public static void main(String args[]){

        Teacher teacher1 = new Teacher("Boldoo","Doctor");
        Teacher teacher2 = new Teacher("Sundui","Ph.D");

        Student student1 = new Student("Renchin","abc123456");

        teacher1.addStudent(student1);
        teacher2.addStudent(student1);

        student1.addTeacher(teacher1);
        student1.addTeacher(teacher2);

        student1.printTeachersInformation();

        teacher1.printStudentsInformation();
        teacher2.printStudentsInformation();

    }
}
