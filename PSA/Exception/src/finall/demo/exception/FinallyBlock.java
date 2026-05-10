package finall.demo.exception;
/*
 > this is extention of try catch block
 > the code we write in finally block will run 100% regardless of exception
 > we can write try_finaly block
 > practical example where finally block can be used -> we can perform db 
  closing file closing operation in finally block
 */
  
public class FinallyBlock {
	
	public static void main(String[] args) {
		try {
			Integer.parseInt("dgdh");
			
		} catch (Exception e) {
			System.out.println("error handeld");
		}
		finally {
			System.out.println("inside finally");
		}
	}
	
}
