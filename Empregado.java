public class Empregado{
    private String nome;
    private String cargo;
    private double salario; 


    public Empregado(String no,String car,double sa){
    nome = no;
    cargo = car;
    salario = sa;
    }

    public void setNome(String no){
        nome = no;
    }
    public String getNome(){
        return nome;
    }
    public void setCargo(String car){
        cargo = car;
    }
    public String getCargo(){
        return cargo;
    }
    public void setSalario(double sa){
        salario = sa;
    }
    public double getSalario(){
        return salario;
    }

    public String imprimir(){
        return "\n Nome: "+nome+"\n Cargo: "+cargo+"\n Salario: "+String.format("%.2f",salario);
    }

    public void aumentoSalario(double aumento){
        salario = salario + salario*aumento/100;
    }

    } 





