public class Bebida {
    private String nome;
    private String tipo;
    private double preco;

    public Bebida(String nome, String tipo, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
    }

    public void prepararBebida() {
        System.out.println("Preparando a bebida: " + nome + " (" + tipo + "), Preço: R$" + preco);
    }
}
