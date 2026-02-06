import java.util.Scanner;

class AuthenticationSystem{
    public static void main(String[] args){
         new LoginAuth();
    }
}
class LoginAuth{
    String username ="triceratops";
    String Password = "daddijihaisupremecourt";
    LoginAuth(){
        input();
    }
    void input(){
        String userinput,userpassword;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
        System.out.print("Enter the username : ");
        userinput = sc.nextLine();
        if(username.equalsIgnoreCase(userinput)){
            System.out.print("Enter the password : ");
            userpassword = sc.nextLine();
            if(Password.equals(userpassword)){
                System.out.println("Correct Password and Username");
                break;
            }
            else{
                System.out.println("Either Username or Password Mismatch");
                continue;
            }
        }
        else{
            System.out.println("Either Username or Password Mismatch");
            continue;
        }
        }
    }
}