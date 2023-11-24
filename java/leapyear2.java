class leapyear2
 {
  public static void main(String[]args)
  { 
     int year=2016;
     if(year%4==0)
       {
              if(year%100==0)
               {
                   if(year%400==0)
                    {
                     System.out.println("is a leapyear"); 
                    }
                     else
                          {
                            System.out.println("not a leapyear"); 
                          }
 
               }
                else
                    {
                      System.out.println("is a leapyear"); 
                    }
       }
        else
            {
             System.out.println("not a leapyear");  
            }
  }
 }