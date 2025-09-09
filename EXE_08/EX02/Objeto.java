public class Objeto {
    private String nome;
    private String material;
    private boolean ePerigoso;

    public Objeto(String nome, String material, boolean ePerigoso) {
        this.nome = nome;
        this.material = material;
        this.ePerigoso = ePerigoso;
    }

    public void mostrarPerigo() {
        System.out.println("Objeto: " + nome + ", Material: " + material + ", Perigoso: " + ePerigoso);
    }
}
