import java.util.Scanner;
 class calculator2{
 public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter frist number");
 int num1=sc.nextInt();
 System.out.println("enter second number");
 int num2=sc.nextInt();
 System.out.println("enter the symbol (+,-,*,/)");
 String sym=sc.next();
 int res;
 switch(sym){
   case"+":res=num1+num2;
   System.out.println("addition is:"+res);
   break;
   case"-":res=num1-num2;
   System.out.println("substration is:"+res);
   break;
   case"*":res=num1*num2;
   System.out.println("multiply is:"+res);
   break;
   case"/":res=num1/num2;
   System.out.println("division is:"+res);
   break;
 }
 }
 }