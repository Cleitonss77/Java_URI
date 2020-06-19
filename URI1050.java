import java.util.Scanner; 

    public class URI1050{
        public static void main(String args[]){

            Scanner input = new Scanner(System.in);
                int DDD,x;

            System.out.println("digite o valod de DDD");
            DDD = input.nextInt();

            x = 0;

            if(DDD > 0){
                
                if(DDD == 61){
                System.out.println("Brasilia");
                x = 1;
                }
                
                if(DDD == 71){
                System.out.println("Salvador");
                 x = 1;
                }

                if(DDD == 11){
                System.out.println("Sao Paulo");
                 x = 1;
                }

                if(DDD == 21){
                System.out.println("Rio de Janeiro");
                 x = 1;
                }

                if(DDD == 32){
                System.out.println("Juiz de Fora");
                 x = 1;
                }

                if(DDD == 19){
                System.out.println("Campinas");
                 x = 1;
                }

                if(DDD == 27){
                System.out.println("Vitoria");
                 x = 1;
                }

                if(DDD == 31){
                System.out.println("Belo Horizonte");
                 x = 1;
                }

                if(x == 0){
                System.out.println("DDD nao cadastrado");
                 x = 1;
                }

                }
                else{ 

                    System.out.println("DDD nao cadastrado");
                }

        }

    }