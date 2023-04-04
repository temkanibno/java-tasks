package task3;

public class DemoAggregation {
    public static void main(String args[]){
        Student student1 = new Student("Boldoo","abc1234");
        Team team1 = new Team("Boldoo's Team");

        team1.addStudent(student1);

        team1.printInformation();
    }
}
