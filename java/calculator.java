import java.util.Scanner;
class calculator
 {
   public static void main(String[]args)
   {
	   String yn;
	     do{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the frist number");
	   int no1=sc.nextInt();
	   System.out.println("enter the second number");
	    int no2=sc.nextInt();
		System.out.println("enter symbol(+,-,*,/)");
		String sym=sc.next();
		int res;
		switch(sym){
			case"+":res=no1+no2;
			System.out.println("addition is:"+res);
			break;
			
			case"-":res=no1-no2;
			System.out.println("substraction is:"+res);
			break;
			
			case"*":res=no1*no2;
			System.out.println("multiply is:"+res);
			break;
			
			case"/":res=no1/no2;
			System.out.println("division is:"+res);
			break;
		}
			System.out.println("if you want to continue(press y for yes and n for no)");
			yn=sc.next();
			
			
		    
		 }while(yn.equals("y")||yn.equals("n"));
		
   }
 }