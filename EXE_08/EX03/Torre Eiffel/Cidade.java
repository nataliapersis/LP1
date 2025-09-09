public class Cidade {
    private String nome;
    private String pais;
    private int populacao;

    public Cidade(String nome, String pais, int populacao) {
        this.nome = nome;
        this.pais = pais;
        this.populacao = populacao;
    }

    public void atualizarPopulacao(int novaPopulacao) {
        this.populacao = novaPopulacao;
        System.out.println("População da cidade " + nome + " atualizada para " + populacao);
    }
}
