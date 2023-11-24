
import java.util.Scanner;
class Amm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int no=sc.nextInt();
        int fir=0;
        int r;
        int g=no;
        while(no>0)
        {
            r=no%10;
            fir=r*r*r+fir;
            no=no/10;
        }
        if(g==fir)
        {
        System.out.println("no is amstrong");
        }
        else
        {
           System.out.println("no is not amstrong");  
        }
    }
}