class Calculator{
    int num = 5;
    int add(int n1, int n2){
        return n1 + n2;
    }
}

public class Stack_Heap {
    public static void main(String args[]){
        int data = 10;
        Calculator calc = new Calculator();
        int r1 = calc.add(10, 20);
        System.out.println(r1);
    }
}
