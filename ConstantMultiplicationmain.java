import java.util.Scanner;

class ConstantMultiplicationmain{
    public static void  main (String[] args){
        new ConstantMultiplication();
    }
}
class ConstantMultiplication{
    int num1;
    int result;
    ConstantMultiplication(){
        input();
        calc();
        disp();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer a : ");
        num1 = sc.nextInt();

    }
    void calc() {
        result = subtract(num1 << 3, num1);
    }
    int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    int subtract(int a, int b) {
        return add(a, add(~b, 1));
    }
    void disp(){
        System.out.println(result);
    }

}