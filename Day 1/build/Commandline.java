class CommandLine{
    public static void main(String args[]){
        if(args.length<0){
            System.out.println("Error:pass minimun 1 parameter")
        
        }
        else{
            int sum=0;
            for(int i=0;i<args.length;i++){
                sum=sum+Intiger.parseInt  (args[1])
            }
            System.out.println("sum:"+sum);
        }
    }
}