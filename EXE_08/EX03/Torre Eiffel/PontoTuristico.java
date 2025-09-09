public class PontoTuristico {
    private String nome;
    private String cidade;
    private String pais;

    public PontoTuristico(String nome, String cidade, String pais) {
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
    }

    public void promoverEvento() {
        System.out.println("Promovendo evento em " + nome + " localizado em " + cidade + ", " + pais);
    }
}
