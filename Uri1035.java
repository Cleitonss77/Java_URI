import java.util.Scanner;

 public class Uri1035{
     public static void main( String args[]){
         Scanner input= new Scanner(System.in);
         int A,B,C,D; 

        System.out.println("Digite o valor de A");
        A = input.nextInt();

        System.out.println("Digite o valor para B");
        B = input.nextInt();

        System.out.println("Digite o valor de C");
        C = input.nextInt();

        System.out.println("Digite o valor de D");
        D = input.nextInt();

        if ((B>C && D>A) && (C+D>A+B) && (C||D > 0) && (A%2 == 0))
            {
                System.out.println("Valores aceitos");
            } 
        else {
                System.out.println("valores não aceitos");

        }


     } 

 }