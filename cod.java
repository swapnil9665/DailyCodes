import java.util.Scanner;

class MAX_STACK{
    int size;
    int arr[];
    int arr2[];
    int top;
    int top2;
    int Max;
    MAX_STACK(int s){
        
        this.size=s;
        arr=new int[s];
        arr2=new int[s]; 
        top=-1;
        top2=0;
        Max=0;
        arr[0]=0;

    }

    int specialPop(){
        if(top<0)
        {
            System.out.println("Stack empty::");
            return 0;
        }
        else
        {

            int val= arr[top];
            top=top-1;
            System.out.println(val);
            if(arr2[top2]==arr[top])
            {
                top2--;
            }
            return val;
        }
        
    }

    

    void specialPush(int a)
    {
        if(top==size-1)
        {
          System.out.println("Stack full");  
        }
        else
        {
            if(a>arr2[top2])
            {
                
                arr2[top2]=a;
                top2++;
            }
            top=top+1;
            arr[top]=a;
            
        }

    }

    int specialTop()
    {
        System.out.println("Top ::- "+this.arr[top]);
        return this.top;
    }

    int specialMax()
    {
        
        




        System.out.println(arr2[top2]);
        return arr2[top2];


    }


}
public class cod {
    
    public static void main(String[] args) {
        MAX_STACK stack=new MAX_STACK(4);
        int cho=100;
       

        Scanner sc=new Scanner(System.in);
    do{
        System.out.println("1. SPush");
        System.out.println("2. Spop");
        System.out.println("3. Stop");
        System.out.println("4. Smax");
        System.out.println("5. Exit");

        System.out.println("enter your choice::- ");
        cho=sc.nextInt();
        switch (cho) {
                case 1:
                    System.out.println("# PUSH #");
                    int val=sc.nextInt();
                    stack.specialPush(val);
                    
                   
                break;
        
                case 2:
                System.out.println("# POP #");
                    
                   
                   
                        stack.specialPop();
                    
                break;
                case 3:
                System.out.println("# TOP #");
                    stack.specialTop();
                break;

                case 4:
                System.out.println("# MAX #");
                stack.specialMax();
                break;

                case 5:
                System.out.println("# Exit #");
                break;
        }

    } while(cho!=5);
    }
}



