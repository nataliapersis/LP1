public class Imovel {
    private String endereco;
    private int numero;
    private double tamanho;

    public Imovel(String endereco, int numero, double tamanho) {
        this.endereco = endereco;
        this.numero = numero;
        this.tamanho = tamanho;
    }

    public void calcularArea() {
        System.out.println("O imóvel localizado em " + endereco + ", nº " + numero + " tem área de " + tamanho + " m².");
    }
}
