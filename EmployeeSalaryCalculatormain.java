import java.util.Scanner;
class EmployeeSalaryCalculatormain{
    public static void main (String []args){
        EmployeeSalaryCalculator obj = new EmployeeSalaryCalculator();
        obj.disp();
    }
}
class EmployeeSalaryCalculator{
    int basic_salary;
    float PF,netsalary;
    EmployeeSalaryCalculator(){
        input();
        calculate();
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary : ");
        basic_salary = sc.nextInt();
    }
    void calculate(){
        PF = (float)(0.12 * basic_salary);
        if(basic_salary>=30000){
            netsalary = (float)(basic_salary * 1.35)-PF;
        }
        else{
            netsalary = (float)(basic_salary * 1.18)-PF;
        }
    }
    void disp(){
        System.out.println("The net salary is : " + netsalary);
    }
}