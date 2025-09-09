public class SuperHeroi {
    private String nome;
    private String poder;
    private int idade;

    public SuperHeroi(String nome, String poder, int idade) {
        this.nome = nome;
        this.poder = poder;
        this.idade = idade;
    }

    public void usarPoder() {
        System.out.println(nome + " está usando o poder: " + poder);
    }

    public void treinarPoder() {
        System.out.println(nome + " está treinando para aprimorar o poder: " + poder);
    }

    public void revelarIdentidade() {
        System.out.println("Identidade revelada: " + nome + ", idade: " + idade);
    }
}
