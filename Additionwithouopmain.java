import java.util.Scanner;

class Additionwithouopmain{
    public static void main(String[] args){
         new Additionwithoutop();
    }
}
class Additionwithoutop{
    int num1 , num2;
    Additionwithoutop(){
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
    void calc(){
            while (num2 != 0) {
                int carry = num1 & num2;
                num1 = num1 ^ num2;
                num2 = carry << 1;
            }
    }
    void disp(){
        System.out.println("The Sum is : "  + num1);
    }
}