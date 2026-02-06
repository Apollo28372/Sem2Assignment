

import java.util.Scanner;
class Menu_Driven_Calculatormain{
    public static void main(String[] args){
        Menu_Driven_Calculator obj = new Menu_Driven_Calculator();
    }
}
class Menu_Driven_Calculator{
    int choice,num1,num2;
    float result1,result2;
    boolean res1=true,res2=true;
    Menu_Driven_Calculator(){
        disp_menu();
        input();
        calculate();
        disp();
    }
    void disp_menu(){
        System.out.println("-------Menu Driven Calculator--------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division ");
        System.out.println("5. Modulus");
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice : ");
        choice = sc.nextInt();
        System.out.print("Enter integer a : ");
        num1 = sc.nextInt();
        System.out.print("Enter integer b : ");
        num2 = sc.nextInt();
    }
    void calculate(){
        switch (choice){
            case 1:
                result1 = num1+num2;
                break;
            case 2:
                result1 = num1-num2;
                result2 = num2-num1;
                break;
            case 3:
                result1 = num1*num2;
                break;
            case 4:
                if(num2==0){
                    res1 = false;
                }
                else{
                    result1 = (float)num1/num2;
                }
                if(num1==0){
                    res2 = false;
                }
                else{
                    result2=(float)num2/num1;
                }
                break;
            case 5:
                result1 = num1%num2;
                result2 = num2%num1;
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
    void disp(){
        switch(choice){
            case 1:
                System.out.println("Integer a + Integer b : " + result1);
                break;
            case 2:
                System.out.println("Integer a - Integer b : " + result1);
                System.out.println("Integer b - Integer a : " + result2);
                break;
            case 3:
                System.out.println("Integer a * Integer b : " + result1);
                break;
            case 4:
                if(res1){
                    System.out.println("Integer a \\ Integer b : " + result1);
                }
                else{
                    System.out.println("Integer a \\ Integer b : infinity ");
                    res1 = true;
                }
                if(res2){
                    System.out.println("Integer b \\ Integer a : " + result2);
                }
                else{
                    System.out.println("Integer b \\ Integer a : infinity ");
                    res2 = true;}
                break;
            case 5:
                System.out.println("Integer a % Integer b : " + result1);
                System.out.println("Integer b % Integer a : " + result2);
                break;
            default :
                //blank statement
        }
    }
}