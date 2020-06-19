

import java.util.Scanner; 

    public class URI1041{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            float x,y;
            x = input.nextFloat();
            y = input.nextFloat();

            if (x>0 && y>0)
            System.out.printf("Q1\n");

            if (y==0 && x!=0)
            System.out.printf("Eixo X\n");

            if (x>0 && y<0)
            System.out.printf("Q4\n");

            if (x==0 && y!=0)
            System.out.printf("Eixo Y\n");

            if (x<0 && y>0)
            System.out.printf("Q2\n");

            if (x<0 && y<0)
            System.out.printf("Q3\n");

            if (x==y && x==0)
            System.out.printf("Origem\n");


        }
    }