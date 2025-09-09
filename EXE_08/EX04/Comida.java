public class Comida {
    private String nome;
    private String tipo;
    private double caloria;

    public Comida(String nome, String tipo, double caloria) {
        this.nome = nome;
        this.tipo = tipo;
        this.caloria = caloria;
    }

    public void calcularPreco() {
        System.out.println("Preço da comida " + nome + " calculado com base no tipo: " + tipo);
    }

    public void addIngrediente(String ingrediente) {
        System.out.println("Ingrediente " + ingrediente + " adicionado à comida " + nome);
    }

    public void verificarQualidade() {
        System.out.println("Verificando qualidade da comida: " + nome);
    }
}
