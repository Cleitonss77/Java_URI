import java.util.Scanner; 

public class MaquinaRfrei{
    public static void main(String args[]){

        Scanner.input = new Sacanner(System.in);

        Refrigerante maquina[];
        maquina = new Refrigerante[5];

        maquina[0] = new Refrigerante ("coca",3.00,5);
        maquina[0] = new Refrigerante ("Sprite",3.00,5);
        maquina[0] = new Refrigerante ("Fanta",3.00,5);

    }
}