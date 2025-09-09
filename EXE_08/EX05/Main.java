public class Main {
    public static void main(String[] args) {
        // Objeto: PEIXE
        Peixe peixe = new Peixe("Tilápia", 1.2, "Cinza");
        peixe.nadar();
        peixe.comer("ração");
        peixe.dormir();

        // Objeto: FAMÍLIA
        Familia familia = new Familia("Silva", 4, "São Paulo");
        familia.reunir();
        familia.adicionarMembro();
        familia.mudarCidade("Rio de Janeiro");

        // Objeto: PLANTA AQUÁTICA
        PlantaAquatica planta = new PlantaAquatica("Vitória-régia", "Lago", 30.0);
        planta.crescer();
        planta.reproduzir();
        planta.fotossintese();
    }
}
