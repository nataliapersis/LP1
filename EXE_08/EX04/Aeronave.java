public class Aeronave {
    private String modelo;
    private String fabricante;
    private double velocidade;

    public Aeronave(String modelo, String fabricante, double velocidade) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.velocidade = velocidade;
    }

    public void decolar() {
        System.out.println("Aeronave " + modelo + " decolando...");
    }

    public void pousar() {
        System.out.println("Aeronave " + modelo + " pousando...");
    }

    public void abastecer() {
        System.out.println("Aeronave " + modelo + " abastecida.");
    }
}
