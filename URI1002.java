import java.util.Scanner;

    public class URI1002{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            double n,R,A; 

            n = 3.14159;

            R = input.nextDouble();

            A=n*(R*R);

            System.out.printf("A=%.4f\n",A);

        }
    }