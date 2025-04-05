public class leet {
    public int[][] divideArray(int[] nums, int k) {
        int a[][];
    int size=(nums.length )%3;
    a=new int[(int)nums.length/3][3];
    if(nums.length%3!=0)
    {
        
        System.out.print("not divide by 3");
       
        
        System.out.println("hdhffdh");
    }
    else{
        for(int i=0;i<nums.length;i++)
          {
              for(int j=0;j<nums.length-1;j++)
              {int temp;
                  if(nums[j]>nums[j+1])
                  {
                      temp=nums[j];
                      nums[j]=nums[j+1];
                      nums[j+1]=temp;
                  }

              }
            }
            
                int o=0;
          for(int l=0;l<nums.length;l+=3)
            {
              if(nums[l+2]-nums[l]<= k) {
                a[o][0]=nums[l];
                a[o][1]=nums[l+1];
                a[o][2]=nums[l+2];
                o++;

              } 
                


            }
            System.out.println("result");
          for(int m=0;m<nums.length/3;m++)
                {
                    for(int n=0;n<3;n++)
                    System.out.println(a[m][n]);
                }
    System.out.println("else");
        
    }
    System.out.println("out");
    
        return a;


}

public static void main(String args[] )
{
   int a[]={33,26,4,18,16,24,24,15,8,18,34,20,24,16,3};
   leet g=new leet();
   g.divideArray(a,16);
}

}