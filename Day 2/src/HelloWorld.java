
public class HelloWorld {
	public static int addnumbers(int a,int b) {
		return a+b;
	}
	public static boolean isprime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		System.out.println("addition:"+addnumbers(5,6));
		System.out.println(args.length);
		System.out.println(args[0]);
		if(isprime(Integer.parseInt(args[1]))) {
			System.out.print("the number is prime"+args[1]);
		}else {
			System.out.print("the number is not prime"+args[1]);
		}
	}

}
