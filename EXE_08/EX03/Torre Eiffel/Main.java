public class Main {
    public static void main(String[] args) {
        // Objeto: TORRE EIFFEL
        PontoTuristico torre = new PontoTuristico("Torre Eiffel", "Paris", "França");
        torre.promoverEvento();

        // Objeto: PARIS
        Cidade paris = new Cidade("Paris", "França", 2148000);
        paris.atualizarPopulacao(2200000);

        // Objeto: CASAS
        Imovel casa = new Imovel("Rue de Paris", 123, 250.0);
        casa.calcularArea();
    }
}
