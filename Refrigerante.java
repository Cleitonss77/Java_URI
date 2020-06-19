public class refrigerante{
    private String marca;
    private double preco;
    private int quantidade;

    public Refrigerante(String marca, double preço, int quantidade)
        {
            this.marca = marca;
            this.preco = preco;
            this.quantidade = quantidade;

        }

        public void tirarEstoque();
        this.quantidade--;

}