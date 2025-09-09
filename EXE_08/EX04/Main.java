public class Main {
    public static void main(String[] args) {
        // Objeto: CAPITÃO AMERICA
        SuperHeroi capitao = new SuperHeroi("Capitão América", "Super força", 100);
        capitao.usarPoder();
        capitao.treinarPoder();
        capitao.revelarIdentidade();

        // Objeto: BOLINHAS DE QUEIJO
        Comida bolinha = new Comida("Bolinhas de Queijo", "Salgado", 350.0);
        bolinha.calcularPreco();
        bolinha.addIngrediente("Queijo extra");
        bolinha.verificarQualidade();

        // Objeto: AVIÃO
        Aeronave aviao = new Aeronave("Boeing 747", "Boeing", 920.0);
        aviao.decolar();
        aviao.pousar();
        aviao.abastecer();
    }
}
