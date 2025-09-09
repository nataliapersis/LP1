import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Objeto: CAFÉ
        Bebida cafe = new Bebida("Café", "Quente", 4.50);
        cafe.prepararBebida();

        // Objeto: JOHN LENNON
        Calendar data = Calendar.getInstance();
        data.set(1940, Calendar.OCTOBER, 9); // nascimento de John Lennon
        Pessoa john = new Pessoa(data.getTime(), "John Lennon", 123456);
        john.calcularIdade();

        // Objeto: GRAOS DE CAFÉ
        Grao graoCafe = new Graos("Arábica", 2.5, "Brasil");
        graoCafe.verificarQualidade();
    }
}
