public class EmpregadoTeste{
    public static void main(String args[]){
        Empregado e1; 
        e1 = new Empregado("Hercules","estagiario",1000f); 


        //System.out.println(e1.salario());

        System.out.println(e1.imprimir());


        e1.aumentoSalario(10);

        System.out.println(e1.imprimir());



    }


}