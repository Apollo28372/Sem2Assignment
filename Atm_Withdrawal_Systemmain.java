import java.util.Scanner;
class Atm_Withdrawal_Systemmain{
    public static void main(String[] args){
        new Atm_Withdrawal_System();
    }
}
class Atm_Withdrawal_System{
    int balance,withdrawal;
    boolean k = true;
    Atm_Withdrawal_System(){
        input();
        calculate();
        disp();
    }
    void input(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the balance : ");
            balance = sc.nextInt();
        System.out.print("Enter the withdrawal amount : ");
        withdrawal = sc.nextInt();
    }
    void calculate(){
        if(withdrawal%100==0){
            if(!((balance-withdrawal)>=1000)){
                k = false;
            }
            else{
                balance -= withdrawal;
            }
        }
        else {
            k =  false;
        }
    }
    void disp(){
        if(k){
            System.out.print("Success \n Balance : " + balance);
        }
        else {
            System.out.print("failure \n Balance : " + balance);
        }
    }
}