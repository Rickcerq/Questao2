public class Produto {
    private String tipo, nome;
    private double preco;

    public Produto();

    public Produto(String tipo, double preco, String nome){
        this.tipo = tipo;
        this.preco = preco;
        this.nome = nome;
    }
}
