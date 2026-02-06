import java.util.Scanner;

class SubtractWithoutopmain{
     public static void main (String[] args){
        new SubtractWithoutop();
    }
}
class SubtractWithoutop{
    int num1 ,num2, num3 = 1;
    SubtractWithoutop(){
        input();
        calc();
        disp();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer a : ");
        num1 = sc.nextInt();
        System.out.print("Enter the Integer b : ");
        num2 = sc.nextInt();
    }
    void calc(){num2 = ~num2;
        while (num3 != 0) {
            int carry = num2 & num3;
            num2 = num2 ^ num3;
            num3 = carry << 1;}
        while (num2 != 0) {
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2 = carry << 1;}
    }
    void disp(){
        System.out.println(" a - b : " + num1);
    }
}