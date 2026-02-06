import java.util.Scanner;
class Digit_Analysismain{
    public static void main(String[] args){
        new Digit_Analysis();
    }
}
class Digit_Analysis{
    int num,SOD,COD;
    Digit_Analysis(){
        input();
        calculate_disp();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer : ");
        num = sc.nextInt();
    }
    void calculate_disp(){
        System.out.print("Reverse of the digit : ");
        if(num==0){
            System.out.print("0\n Sum of digits : 0 \n Count of digits : 1");

        }
        else {
            while (num != 0) {
                SOD += num % 10;
                COD++;
                System.out.print(num % 10);
                num /= 10;
            }
            System.out.println(" \n Sum of digits :" + SOD + "\n Count of digits : " + COD);
        }
    }
}