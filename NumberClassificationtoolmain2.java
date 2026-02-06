import java.util.Scanner;
class NumberClassificationtoolmain2{
    public static void main(String[] args){
        NumberClassificationtool obj = new NumberClassificationtool();
        obj.Disp();
    }
}
class NumberClassificationtool{
    int num;
    boolean sign, prime, divisible,parity;
    NumberClassificationtool(){
        input();
        calculate();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        num = sc.nextInt();
    }
    void calculate(){
        if(num%2==0){parity = true;}
        if(num>=0){
            sign = true;
        }
        if(num%5==0&&num%7==0){
            divisible = true;
        }
        if(sign&&!divisible) {
            if(num==2||num==3){
                prime = true;
            }
            else if (num<3) {
                // empty statement :)
            }
            else {
                prime=true;
                int numsqrt = (int) Math.sqrt(num);
                for(int i=2;i<=numsqrt;i++){
                    if(num%i==0){
                        prime = false;
                        break;
                    }
                }
            }
        }
    }
    void Disp() {
        System.out.println("The given number is : ");
        System.out.println("Prime : " + (prime?"Yes":"No"));
        System.out.println("Sign  : " + (sign?"Positive":"Negative"));
        System.out.println("Divisible by both 5 and 7 : " + (divisible?"Yes":"No"));
        System.out.println("Even or Odd : " + (parity?"Even":"Odd"));
    }
}