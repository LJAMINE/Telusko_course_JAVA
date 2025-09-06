
class Calculator {

    int number1;
    int number2;


    public int add(int number1,int number2) {
        int r = number1 + number2;
        return r;
    }
}

class Demo {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        Calculator calc = new Calculator();

        int result = calc.add(num1,num2);

        System.out.println(result);

        
    }
}
