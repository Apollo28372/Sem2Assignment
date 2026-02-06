import java.util.Scanner;

class MaximumWithoutcomparisonmain{
    public static void main(String[] args){
        new MaximumWithoutcomparison();
    }
}
class MaximumWithoutcomparison{
    int num1,num2,result;
    MaximumWithoutcomparison(){
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
        int diff = subtract(num1, num2);
        int sign = (diff >> 31) & 1; // 0 if positive, 1 if negative
        result = num1 * (1 - sign) + num2 * sign;
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