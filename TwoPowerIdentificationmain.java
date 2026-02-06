import java.util.Scanner;

class TwoPowerIdentificationmain{
    public static void main(String[] args){
     new TwoPowerIdentification();
    }
}
class TwoPowerIdentification {
    int count, num1;
    boolean result = true;
    TwoPowerIdentification() {
        input();
        check();
        display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        num1 = sc.nextInt();
    }
    void check(){
        if(num1<1){
            result = false;
        }
        else{
            if((num1&1)==1){
                count++;
            }
            num1=num1>>1;
            if(num1!=0){
                check();
            }
        }
    }
    void display(){
        if(!result||(count>1)){
            System.out.println("Its not a power of 2");
        }
        else{
            System.out.println("Its a power of 2");
        }
    }
}