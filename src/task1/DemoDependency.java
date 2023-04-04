package task1;

public class DemoDependency {
    public static void main(String args[]){
        Calculator calculator = new Calculator(9,3);
        System.out.print("Multiple is:");
        calculator.printMultiple();
        System.out.print("Sum is:");
        calculator.printSum();
        System.out.print("Divide is:");
        calculator.printDivide();
        System.out.print("Minus is:");
        calculator.printMinus();
    }
}
