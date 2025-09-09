public class PlantaAquatica {
    private String especie;
    private String habitat;
    private double tamanho;

    public PlantaAquatica(String especie, String habitat, double tamanho) {
        this.especie = especie;
        this.habitat = habitat;
        this.tamanho = tamanho;
    }

    public void crescer() {
        tamanho += 0.5;
        System.out.println("A planta " + especie + " cresceu. Novo tamanho: " + tamanho + " cm.");
    }

    public void reproduzir() {
        System.out.println("A planta " + especie + " está se reproduzindo no habitat " + habitat + ".");
    }

    public void fotossintese() {
        System.out.println("A planta " + especie + " está realizando fotossíntese.");
    }
}
