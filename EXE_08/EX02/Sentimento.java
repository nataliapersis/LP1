public class Sentimento {
    private String nome;
    private int intensidade;
    private String causa;

    public Sentimento(String nome, int intensidade, String causa) {
        this.nome = nome;
        this.intensidade = intensidade;
        this.causa = causa;
    }

    public void expressarSentimento() {
        System.out.println("Sentimento: " + nome + ", Intensidade: " + intensidade + ", Causa: " + causa);
    }
}
