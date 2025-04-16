class Calculator {
    protected double a;
    protected double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void display() {
        System.out.println("First Number: " + a);
        System.out.println("Second Number: " + b);
    }
}

class Addition extends Calculator {
    public Addition(double a, double b) {
        super(a, b);
    }

    public double add() {
        return a + b;
    }
}

class Subtraction extends Addition {
    public Subtraction(double a, double b) {
        super(a, b);
    }

    public double subtract() {
        return a - b;
    }
}

class Multiplication extends Subtraction {
    public Multiplication(double a, double b) {
        super(a, b);
    }

    public double multiply() {
        return a * b;
    }
}

class Division extends Multiplication {
    public Division(double a, double b) {
        super(a, b);
    }

    public double divide() {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        System.out.println("NAME: G.HIMAJA");
        System.out.println("ROLL.NO: AV.SC.U4CSE24111\n");

        Division calc = new Division(100, 10); // only one object needed
        calc.display();

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
    }
}
