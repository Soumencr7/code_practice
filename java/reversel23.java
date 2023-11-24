  import java.util.Scanner;
  
   class reversel23
   {
      public static void main(String[]args)
	   {
	      Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
		  int no=sc.nextInt();
		  int rem;
		  int rev=0;
		  while(no !=0)
		
		 {
			rem=no%10;
		    rev=rev*10+rem;
		    no=no/10;
		 }	 
		  System.out.print(rev);
		}
	}