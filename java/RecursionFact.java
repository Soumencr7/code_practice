 class RecursionFact{
   static int fact=1;
    void calcfact(int no)
   {
      if(no>=1)
	   {
	     fact=fact*no;
		 calcfact(no-1);
	   }
   }
 
  public static void main(String[]args){
    int no=5;
	 RecursionFact ob=new RecursionFact();
	  ob.calcfact(no);
	System.out.println("factorial of"+no+"is"+fact);
	}
 }