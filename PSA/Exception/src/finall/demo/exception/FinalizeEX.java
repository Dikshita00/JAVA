package finall.demo.exception;

public class FinalizeEX {
	
   @Override
	protected void finalize() {
	   
	   System.out.println("Garbage Collection");
   }
   public static void main(String[] args) {
	   
	   System.gc();
	   
	
   }
}
