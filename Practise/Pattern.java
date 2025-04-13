import java.io.*;
public class Pattern {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br  = new BufferedReader(isr);
        
        System.out.println("enter row ");
        int row = Integer.parseInt(br.readLine());

        for(int i = 1;i<=row;i++){

            for(int j = 1;j<=i;j++){
                System.out.print("*\t");



            }
            System.out.println("");


        }

System.out.println("\n\nSecond Pattern\n");

        for(int i = 1;i<=row;i++){

            for(int j = 1;j<=row-i+1;j++){
                System.out.print("*\t");



            }
            System.out.println("");


        }
        System.out.println("\n\nThird Pattern:");

        for(int i = 1;i<=row;i++){

            for(int j = 1;j<=row;j++){
                if(j<=row-i){
                System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }


            }
            
            System.out.println("");


        }
        

        System.out.println("\n\nFourth Pattern:");

        for(int i = 1;i<=row;i++){

            for(int j = 1;j<=row;j++){
                if(j<=i-1){
                System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }


            }
            
            System.out.println("");


        }
        


        System.out.println("\n\nFifth Pattern:");

        for(int i = 1;i<=row;i++){

            //space
            for(int j = 1;j<=row-i;j++){
                
                System.out.print("\t");
               }

               ///*
            for(int k = 1;k<=i*2-1;k++){
                System.out.print("*\t");
            }
            
            System.out.println("");


        }

        System.out.println("\n\nSixth Pattern:");

        for(int i = 1;i<=row;i++){

            //space
            for(int j = 1;j<=i-1;j++){
                
                System.out.print("\t");
               }

               ///*
            for(int k = 1;k<=((row-i+1)*2-1);k++){
                System.out.print("*\t");
            }
            
            System.out.println("");


        }

        System.out.println("\n\nSeventh Pattern:");
        int col = 1;
        for(int i = 1;i<=row*2-1;i++){
//space
            if(i<=row){

                for(int j = 1;j<=row-i;j++){
                
                    System.out.print("\t");
                   }
    
               

            }else{

                for(int j = 1;j<=i-row;j++){
                
                    System.out.print("\t");
                   }


            }

            
            if(i<=row){
                col = i*2-1;
                for(int k = 1;k<=col;k++){

                    
                
                        System.out.print("*\t");
                      
                }


            }
            else{
                col -=2;
                for(int k = 1;k<=col;k++){

                    System.out.print("*\t");
                    
                }




            }
           

System.out.println("");
        }


        System.out.println("\nEighth pattern \n");
        int c =1;;
        for(int i = 1;i<row*2;i++){
            
            if(i<=row){
                c = i;
            }else{
                c = c-1;
            }
            for(int cl = 1;cl<=c;cl++){

                System.out.print("*");
            }
            System.out.println("");



        }


        System.out.println("\nnininth pattern \n\n");
        for(int r = 1;r<=row*2-1;r++){

            int no_Col = (r>row)?row*2-r:r;
            int no_Space = row - no_Col;

            for(int i = 1;i<=no_Space;i++){

                System.out.print(" ");
            }
            for(int j = 1;j<=no_Col;j++){

                System.out.print("* ");
            }
     
             System.out.println("");



        }

    }
}
