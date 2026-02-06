import java.util.Scanner;

class QuotientWithoutDivisionmain{
    public static void main(String[] args){
         new QuotientWithoutDivision();
    }
}
class QuotientWithoutDivision{
    int num1,num2;
    float result;
    QuotientWithoutDivision(){
        input();
        calc(num1,num2);
        disp();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer a : ");
        num1 = sc.nextInt();
        System.out.print("Enter the Integer b : ");
        num2 = sc.nextInt();
    }
    void calc(int dividend, int divisor) {
        int quotient = 0;
        boolean negative = (dividend < 0) ^ (divisor < 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        for (int i = 31; i >= 0; i--) {
            if ((dividend >> i) >= divisor) {
                dividend = subtract(dividend, divisor << i);
                quotient |= (1 << i);
            }
        }
        result = (float)(negative ? add(~quotient, 1) : quotient);
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
        System.out.println(" a divides by b : " + result);
    }
}
