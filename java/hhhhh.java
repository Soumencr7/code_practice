import java.util.Scanner;
class hhhhh{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many star do you want :");
        int no=sc.nextInt();
        int i=1;
        int st=no;
        if(no==0)
        return;
        else if(no==1){
          System.out.println("*");
	       return; 
		}else{
	      while(i<=no){
	      if(i==1){
	      System.out.println("*");
	      --st; 
		  }else{
	    for(int j=1;j<=st;j++){
	    System.out.print("*");
	    --st;
	    }
	   }
	   i++;
	    }
	  }
   }
}