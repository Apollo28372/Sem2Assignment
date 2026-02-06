import java.util.Scanner;
public class BillingSystemmain{
    public static void main(String[] args){
        BillingSystem obj = new BillingSystem();
        obj.Disp();
    }
}
class BillingSystem{
    float price=0f,bill; int quantity;
    BillingSystem()
    {
        input();
        calculate();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price : "); //hope nobody gives me negative value :)
        price = sc.nextFloat();
        System.out.println("Enter the quantity : ");//  anything but a negative value
        quantity = sc.nextInt();
        bill = price * quantity;
    }
    void calculate(){
        if(bill>=5000){
            bill *= 0.9f;
        }
        else if (bill>=2000) {
            bill *= 0.95f;
        }
        bill *= 1.18f;
    }
    void Disp(){
        System.out.println("The Final bill is : " + bill);
    }
}