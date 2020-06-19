import java.util.Scanner; 
    public class URI1051{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            float salario, taxa;
            taxa = 0;
            salario = input.nextFloat(); 

            if (salario <= 2000)
            System.out.printf("Isento\n");

            else {
                if (2000 < salario && salario <= 3000)
                    taxa = ((salario -2000) * 8) / 100;

                if (3000 < salario && salario <= 4500)    
                    taxa = 80 + ((salario - 3000) * 18 / 100);

                if (salario > 4500)    
                    taxa = 350 + ((salario - 4500) * 28 /100);


                 System.out.printf("R$ %.2f\n",taxa);     
            }
            
        }

    }