public class Clima {
    private String estacao;
    private double temperatura;
    private boolean vaiChover;

    public Clima(String estacao, double temperatura, boolean vaiChover) {
        this.estacao = estacao;
        this.temperatura = temperatura;
        this.vaiChover = vaiChover;
    }

    public void descreverClima() {
        System.out.println("Estação: " + estacao + ", Temperatura: " + temperatura + "°C, Vai chover: " + vaiChover);
    }
}
