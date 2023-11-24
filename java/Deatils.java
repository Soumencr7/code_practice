import java.util.Scanner;
class Deatils{
 public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your name");
  String name=sc.next();
  System.out.println("Enter your age");
  int age=sc.nextInt();
  System.out.println("Enter your gender");
  char gender=sc.next().charAt(0);
  System.out.println("Enter your phNo");
  long phNo=sc.nextLong();
  System.out.println("............................");
  System.out.println("name:"+name);
  System.out.println("age:"+age);
  System.out.println("gender:"+gender);
  System.out.println("PhNo:"+phNo);
 }
}