import java.util.Scanner;

public class Exercicio2b{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float base,altura,area;
        

        System.out.println("Digite a base do retangulo:");
        base = teclado.nextFloat();

        System.out.println("digite a altura do retangulo");
        altura = teclado.nextFloat();

    
        area = base * altura;

        System.out.println("A area do retangulo e" +area);




    } 


}