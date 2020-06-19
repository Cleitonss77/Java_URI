public class Televisao{
    String marca;
    int tamanhoTela;
    int canal;
    int volume;
    boolean ligada;

    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }
    void avancarCanal(){
        if (ligada == true){
            if(canal<99){
            canal++;
            System.out.println("A TV "+marca+" esta no canal "+canal);
            }
            else if(canal==99);
            canal = 1;
            System.out.println("A TV "+marca+" esta no canal "+canal);

        }
        else{
            System.out.println("Por favor ligue a TV "+marca+ "antes");
        }
     }
    void recuaCanal(){
        if (ligada == true){
            if (canal>1){
            canal--;
            System.out.println("A TV"+marca+" esta no canal "+canal);
            }
            else if (canal==1){
            canal = 99;
            System.out.println("A TV"+marca+" esta no canal "+canal);
            }         
        }
            else{
                System.out.println("Por favor ligue antes a TV "+marca);

            }
        }
    }


