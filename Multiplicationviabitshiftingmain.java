import java.util.Scanner;

class Multiplicationviabitshiftingmain{
    public static void main (String[] args){
        new Multiplicationviabitshifting();
    }
}
class Multiplicationviabitshifting{
    int num1,num2;
    int result = 0;
    Multiplicationviabitshifting(){
        input();
        check();
        disp();
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer a : ");
        num1 = sc.nextInt();
        System.out.print("Enter the Integer b : ");
        num2 = sc.nextInt();
    }
    void check(){

            boolean negative = (num1 < 0) ^ (num2 < 0);

            num1 = Math.abs(num1);
            num2 = Math.abs(num2);

            while (num1 != 0) {
                if ((num2 & 1) == 1) {
                    result = add(result, num1);
                }
                num1 <<= 1;
                num2 >>= 1;
            }
            result = negative ? add(~result, 1) : result;
    }
    int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
    void disp(){
        System.out.println(" The Multiplication is : " + result);
    }
}