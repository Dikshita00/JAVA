import java.util.Scanner;
class Addition{

    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First No.");
        int num1=sc.nextInt();
        System.out.println("Enter Second No.");
        int num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Addition is :"+sum);

        
    }
}