import java.util.Scanner;

    public class Exercico20{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
                double genero,altura,pesoIdeal;


             System.out.println("Digite o genero da pessoa '1' para homen e '2' para mulher");
             genero = input.nextDouble();


            System.out.println("Digite a altura da pessoa");
            altura = input.nextDouble(); 


            if (genero == 1)
                {
                    pesoIdeal = (72.7*altura) -58;

                } 
            else
                {
                    pesoIdeal = (62.1*altura) -44.7;
                }


                System.out.println("O peso ideal e "+pesoIdeal);



        }






    } 