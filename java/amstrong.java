 import java.util.Scanner;
  
   class amstrong
   {
      public static void main(String[]args)
	   {
		   int c;
		   int que=0;
		  int rem;
	      Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
		  int no=sc.nextInt();
		  
		  c=no;
		  while(no>0)
		  {
		    rem=no%10;
		    que=(rem*rem*rem)+que;
		    no=no/10;
		  }
		  if(c==que)
		  System.out.println("amstrong");
		  else
		  System.out.println("not amstrong");
		  
	   }
   }	   