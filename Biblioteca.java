public class Biblioteca{
    private String titulo;
    private String autor;
    private int publicacao;
    private String categoria;
    private int numeroDaEstante;
    private int numeroDaPrateleira;
    private boolean emprestado;


    public Biblioteca(String titulo,String autor,int publicacao,String categoria,int numeroDaEstante,int numeroDaPrateleira,boolean emprestado)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacao = publicacao;
        this.categoria = categoria;
        this.numeroDaEstante = numeroDaEstante;
        this.numeroDaPrateleira = numeroDaPrateleira;
        this.emprestado = emprestado;
    }  

    public void setEmprestimo(boolean emprestado){
        this.emprestado = true;}

    public boolean getEmprestimo(){
        return emprestado;
    }
    public String imprimir(){
        return "\n titulo: "+titulo+"\n emprestado: "+emprestado);
    }
}