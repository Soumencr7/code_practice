import java.util.Scanner;
class printtable2{
public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number you want to print table");
	 int no=sc.nextInt();
	 for(int i=1;i<=10;i++)
	 {
	 System.out.println(no+"*"+i+"="+no*i);
	 }
   }
  }