 import java.util.Scanner;
  class automorphic2{
      public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int l=(""+no).length();
		int sq=no*no;
		int end=(int)(sq%(Math.pow(10,l)));
         if(no==end)
          {
		   System.out.println("no is automorphic");
		  }		 
		  else
		  {
		    System.out.println("no is not automorphic");
		  }
	 }
 }