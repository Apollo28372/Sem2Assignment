import java.util.Scanner;
class Electricity_bill_generatormain{
    public static void main(String[] args){
        new Electricity_bill_generator();
    }
}
class Electricity_bill_generator{
    int charge = 150,units;
    Electricity_bill_generator(){
        input();
        calculate();
        disp();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of units : ");
        units = sc.nextInt();
    }
    void calculate(){
        if(units>200){
            charge += (units-200)*5 + 100*2 + 100*3;
        } else if (units>100) {
            charge += (units-100)*3 + 100*2;
        }
        else{
            charge += units*2;
        }
    }
    void disp(){
        System.out.println("Electricity bill : " + charge);
    }
}