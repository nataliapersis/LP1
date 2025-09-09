public class Grao {
    private String tipo;
    private double peso;
    private String origem;

    public Graos(String tipo, double peso, String origem) {
        this.tipo = tipo;
        this.peso = peso;
        this.origem = origem;
    }

    public void verificarQualidade() {
        System.out.println("Grão: " + tipo + ", Peso: " + peso + "kg, Origem: " + origem);
    }
}
