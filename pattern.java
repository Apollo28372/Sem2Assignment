import java.util.Scanner;

class pattern{
    public static void main (String[] args){
        new patternr();
    }
}
class patternr{
    int num;
    patternr(){
        input();
        display();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        num = sc.nextInt();
    }
    void display(){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}