import java.util.Scanner;

class TemporarylessSwapmain{
    public static void main(String[] args){
        new TemporarylessSwap();
    }
}
class TemporarylessSwap{
    int num1,num2;
    TemporarylessSwap(){
        input();
        swapbitwise();
        display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer a  : ");
        num1 = sc.nextInt();
        System.out.print("Enter Integer b  : ");
        num2 = sc.nextInt();
    }
    void swapbitwise(){
        int c = num1^num2;
        num1=c^num1;
        num2=c^num2;
    }
    void display(){
        System.out.println("After swapping ");
        System.out.println("Integer a : " + num1);
        System.out.println("After b : " + num2);
    }
}