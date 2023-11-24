import java.util.Scanner;
class primeno3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int no=sc.nextInt();
       int temp=0;
       for(int i=2;i<=no/2;i++)
       if(no%i==0)
       {
           temp=temp+1;
       }
       if(temp==0)
       {
        System.out.println("number is  prime");
       }
       else
       {
        System.out.println("number is not prime");
       }
    }
}