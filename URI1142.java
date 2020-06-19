import java.util.Scanner; 

    public class URI1142{
        public static void main(String args[]){ 
            Scanner input = new Scanner(System.in);

            int n,valor,contPUM,linha;

            contPUM = 0;
            n = input.nextInt();
            valor=1;
            linha=n;

            while ( linha > 0)
            {
               
                while (contPUM !=3) {   
                    System.out.printf(valor+" ");
                    valor++;
                    contPUM++; }

                if (contPUM == 3){
                    valor++;
                    contPUM = 0;
                   System.out.println("PUM");
                   linha--; 
                   }
            } 

        }

    }