import java.util.Scanner;

class SetBitCountermain{
    public static void main(String[] args){
        new SetBitCounter();
    }
}
class SetBitCounter{
    int num1,count;
    SetBitCounter(){
        input();
        check();
        disp();
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer : ");
        num1 = sc.nextInt();
    }
    void check(){
        for(int i=0;i<32;i++){
            if((num1&1)==1){
                count++;
            }
            num1 = num1 >> 1;
        }
    }
    void disp(){
        System.out.println("Total number of set bits are : " + count);
    }
}
