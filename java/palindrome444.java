
import java.util.Scanner;
class palindrome444{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
		int rev=0;
		int rem;
		int copy=no;
		while(copy>0){
		 rem=copy%10;
		 rev=rev*10+rem;
		 copy=copy/10;
		}
		 if(no==rev)
		{
		 System.out.println(no+"no is palindrome");
		}
		else
		{
		 System.out.println(no+"no is not palindrome");
		}
   }
 }
		