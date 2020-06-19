import java.util.Scanner;

    public class Exercicio3{
        public static void main(String args[]){
            Scanner teclado = new Scanner(System.in);

            double salarioMinimo, unidadekw, totalkw, custototal;


            System.out.println("Digite o valor do salario minimo");
            salarioMinimo = teclado.nextDouble();

            System.out.println("Digite o consumo em kw");
            totalkw = teclado.nextDouble();

            // csto de 1 kw 
            unidadekw = (salarioMinimo/7)/100;

            //custo total em kw
            custototal = unidadekw * totalkw;

            System.out.println("O custo de cada %.3d kw e:\n" +unidadekw);
            System.out.println("O custo total e:\n" +custototal);




        }






    }