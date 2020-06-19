
Import java.util.Scanner; // vou precisar usar a biblioteca scanner 


public class TesteEntrada{
    public static void main(String args[]){

        Scanner teclado = new Scanner(System.in);
        int a,b,c;


        System.out.println("Digite os valores de A e B");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        System.out.println("valor de a = " + a);
        System.out.println("valor de b = " + b);
        System.out.println("valor de c = " + c);
        System.out.println("Digite o valor para D");
        double d = teclado.nextDouble();
        System.out.println("valor de d = " + d);

    }



}