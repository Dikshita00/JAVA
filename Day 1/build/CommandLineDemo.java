class CommandLineDemo{

public static void main(String args[]){
	
	System.out.println("Enter elements:" + args.length);
	if(args.length<=0){
		System.out.println("Error : Enter at least one parameter");
	}else{
		for(int i=0;i<=args.length;i++){
			System.out.println("HELLO :" +args[i]);
		}
	}

}

}