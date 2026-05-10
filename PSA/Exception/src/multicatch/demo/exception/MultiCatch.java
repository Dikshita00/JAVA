package multicatch.demo.exception;
//we can create multipal catch block
//always start with child class exception c;ass followed by parent class
public class MultiCatch {
	
	static int x=10;
	
	public static void main(String[] args) {
		try {
			Integer.parseInt("erggdjcl"); //3
			int a1=x/0;//1
			MultiCatch a2=null;
			System.out.println(a2.x);
			
			
		} catch (ArithmeticException e) {
			System.out.println(1);
			
		}
		catch (NullPointerException e) {
			System.out.println(2);
		}
		catch (Exception e) { //parent ecxeption classs
			System.out.println(3);
		}
	}

}
