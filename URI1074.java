import java.util.Scanner; 
    public class URI1072{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in); 

            int n,x,i;
            n = input.nextInt();

            for(i=0; i<n ; i++ ) 
            {
                x = input.nextInt();

                if (x == 0)
                System.out.printf("NULL\n"); 
                else if (x > 0)
                {
                    if (x%2 == 0)
                    System.out.printf("EVEN POSITIVE\n");
                    else
                    System.out.printf("ODD POSITIVE\n");
                }
                else if (x < 0)
                {
                    if (x%2 == 0)
                    System.out.printf("EVEN NEGATIVE\n");
                    else
                    System.out.printf("ODD NEGATIVE\n");
            
                }
            
            } 
            

        }

    }