class Calculator{
    int add(int num1, int num2){
        return num1 + num2;
    }
}

public class DemoClass {
    public static void main(String args[]){
        int num1 = 10, num2 = 20;
        Calculator calc = new Calculator();
        System.out.println(calc.add(num1, num2));
    }
}
