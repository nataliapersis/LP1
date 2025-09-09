public class Main {
    public static void main(String[] args) {
        // Objeto: TEMPESTADE
        Clima temp = new Clima("Inverno", 10.5, true);
        temp.descreverClima();

        // Objeto: TRISTEZA
        Sentimento triste = new Sentimento("Tristeza", 8, "Perda");
        triste.expressarSentimento();

        // Objeto: CACO DE VIDRO
        Objeto vidro = new Objeto("Caco de Vidro", "Vidro", true);
        vidro.mostrarPerigo();
    }
}
