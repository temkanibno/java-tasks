package task1;

public class Calculator {
    private int a;

    private int b;

    MathOperations mathOperations = new MathOperations();

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void printSum(){
        int result = mathOperations.sumNumbers(this.a,this.b);
        System.out.println(result);
    }

    public void printMultiple(){
        int result = mathOperations.multipleNumbers(this.a,this.b);
        System.out.println(result);
    }

    public void printMinus(){
        int result = mathOperations.minusNumbers(this.a,this.b);
        System.out.println(result);
    }

    public void printDivide(){
        double result = mathOperations.divideNumbers(this.a,this.b);
        System.out.println(result);
    }
}
