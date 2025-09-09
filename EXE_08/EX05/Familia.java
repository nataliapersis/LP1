public class Familia {
    private String sobrenome;
    private int membros;
    private String cidade;

    public Familia(String sobrenome, int membros, String cidade) {
        this.sobrenome = sobrenome;
        this.membros = membros;
        this.cidade = cidade;
    }

    public void reunir() {
        System.out.println("A família " + sobrenome + " está reunida em " + cidade + ".");
    }

    public void adicionarMembro() {
        membros++;
        System.out.println("Um novo membro foi adicionado à família " + sobrenome + ". Total de membros: " + membros);
    }

    public void mudarCidade(String novaCidade) {
        this.cidade = novaCidade;
        System.out.println("A família " + sobrenome + " se mudou para " + cidade + ".");
    }
}
