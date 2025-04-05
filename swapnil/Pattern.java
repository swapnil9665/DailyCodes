public class Pattern{
   public static void main(String arg[])
   {
    //     int a = 5;
    // for(int i=1;i<6;i++)
    // {
    //     for(int j=1;j<=i;j++)
    //     {
    //         System.out.print(i);
    //     }
    //     System.out.println("");
    // }

//    Pattern2
    for(int k=5;k>=1;k--)
    {
        int n=5;
        for(int j=k;j>=1;j--)
        {
            System.out.print(n);
            n=n-1;
        }
        System.out.println("");
    }
   
//    } 

   //pattern 3
   for(int i=2;i<6;i++)
   {
       int n=5;
       for(int j=1;j<=i;j++)
       {
           System.out.print(n);
           n=n-1;
       }
       System.out.println("");
   }
  
  } 
}