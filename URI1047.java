import java.util.Scanner; 

    public class URI1047{
        public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int horaI,minI,horaF,minF,totalH,totalM;

        horaI = input.nextInt();
        minI = input.nextInt();
        horaF = input.nextInt();
        minF = input.nextInt();

        totalH = horaF - horaI;
        totalM = minF - minI;

        if (totalH==0 && totalM==0)
            totalH = 24;

        while (totalH<0 || totalM<0)
        {
        if (totalH < 0)
            totalH = totalH + 24;

        if (totalM < 0){
            totalH = totalH - 1;
            totalM = totalM + 60;
        }
        }

    System.out.printf("O JOGO DUROU "+totalH+" HORA(S) E "+totalM+" MINUTO(S)\n");

        }

    }