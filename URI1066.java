import java.util.Scanner;

    public class URI1066{
        public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int valor = 0; 
        int pares = 0;
        int impares = 0; 
        int positivos = 0;
        int negativos = 0;
        int i;

        for (i=1 ; i <= 5 ; i++)
            {
                valor = input.nextInt();

                if (valor%2 == 0)
                pares++;
                else
                impares++;
               
                if (valor > 0)
                positivos++;
                else if (valor < 0)
                negativos++; 

            }

        System.out.printf(pares+" valor(es) par(es)\n");
        System.out.printf(impares+" valor(es) impar(es)\n");
        System.out.printf(positivos+" valor(es) positivo(s)\n");
        System.out.printf(negativos+" valor(es) negativo(s)\n");

        }

    }