public class Peixe {
    private String especie;
    private double peso;
    private String cor;

    public Peixe(String especie, double peso, String cor) {
        this.especie = especie;
        this.peso = peso;
        this.cor = cor;
    }

    public void nadar() {
        System.out.println("O peixe da espécie " + especie + " está nadando.");
    }

    public void comer(String alimento) {
        System.out.println("O peixe " + especie + " está comendo " + alimento + ".");
    }

    public void dormir() {
        System.out.println("O peixe " + especie + " está dormindo.");
    }
}
