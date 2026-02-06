import java.util.Scanner;

class PrimeRange{
    public static void main (String[] args){
        new prmRng();
    }
}
class prmRng{
    int num1 , num2;
    int a,b; // my slave but important identifiers
    prmRng(){
        input();
        calculatedisp();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer a : ");
        num1 = sc.nextInt();
        System.out.print("Enter Integer b : ");
        num2 = sc.nextInt();
        a=num1;b=num2;

    }
    void calculatedisp(){
        if((num1<2&&num2<2)||((num1-num2)==0)||((num1-num2)==1)||((num2-num1)==1)){
            System.out.println("No Prime numbers between the given numbers");
        }
        else{
            if(num1<2){
                a=1;
            }
            else if (num2<2) {
                a=1;b=num1;
            }
            else {
                if(num1>num2){
                    a=num2;b=num1;
                }
            }
            boolean check2 = false;
            System.out.print(" The Prime Numbers between the given numbers are : ");
            for(int i = (a+1);i<b;i++){boolean check1 = true;
                for ( int j=2;j<=(int)Math.sqrt(i);j++) {
                    if(i%j==0){
                        check1 = false;
                        break;
                    }
                }
                if(check1){
                    check2 = true;
                    System.out.print(i + " ");
                }
            }
            if(!check2){
            System.out.print(" None ");
            }
        }
    }
}