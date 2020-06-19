/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.

Exemplo de Entrada
Exemplo de Saída
3 2
Total: R$ 10.00
4 3
Total: R$ 6.00
2 3 */

import java.util.Scanner; 

public class URI1038{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int quantidade,lanche;
        float valor, total; 
        valor = 0;
      
        quantidade = input.nextInt();
        lanche = input.nextInt();
       
        if (lanche == 1){
        valor = 4f;}

        if (lanche == 2){
        valor = 4.5f;}

        if (lanche == 3){
        valor = 5f;}

        if (lanche == 4){
        valor = 2f;}

        if (lanche == 5){
        valor = 1.5f; }

        total = quantidade * valor;

        System.out.printf("Total: R$ %.2f\n",total); 
    }
}





