import java.util.Scanner;
  class perfectnumber{
      public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<no;i++)
		if(no%i==0)
		{
		 sum=sum+i;
		}
		if(no==sum)
		System.out.println("no is perfect");
		else
		System.out.println("no is not perfect");
	 }
}	 