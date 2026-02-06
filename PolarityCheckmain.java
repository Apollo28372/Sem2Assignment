import java.util.Scanner;

class PolarityCheckmain{
    public static void main( String[] args){
         new PolarityCheck();
    }
}
class PolarityCheck{
    int num1;
    String polarity;
    PolarityCheck(){
        input();
        check();
        display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        num1 = sc.nextInt();
    }
    void check(){
        if((num1&1)==1){
            polarity = "Odd";
        }
        else {
            polarity = "Even";
        }
    }
    void display(){
        System.out.println(polarity);
    }
}