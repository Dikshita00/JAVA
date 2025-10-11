import java.util.Scanner;

public class Test2 {
	
	public static int factorial(int n) {
		if(n<=1)
			return 1;
		else {
			int f=1;
			for(int i=1;i<=n;i++) {
			f=f*i;
			}
			return f;
			}
		
		}
		
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=sc.nextInt();
		int ans=factorial(n);
		System.out.println("Result is :"+ans);
		
	}

}
