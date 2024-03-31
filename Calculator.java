
class Calculator extends Extended_Calculator {

    float addition(float a, float b) {
        return (a + b);
    }

    float substraction(float a, float b) {
        return (a - b);
    }

    float multiplication(float a, float b) {
        return (a * b);
    }

    float division(float a, float b) {
        return (a / b);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        float a = 10;

        float b = 20;
        float n = 10;
        float add = calc.addition(a, b);
        System.out.println("Addition of two Numbers:" + add);

        float sub = calc.substraction(a, b);
        System.out.println("Substraction :" + sub);

        float mul = calc.multiplication(a, b);
        System.out.println("Multiplication:" + mul);

        float div = calc.division(a, b);
        System.out.println("Division:" + div);

        float square = calc.square(n);
        System.out.println("Square:" + square);

        float cube = calc.cube(n);
        System.out.println("Cube:" + cube);

    }
}