import java.util.Date;
import java.util.Calendar;

public class Pessoa {
    private Date nascimento;
    private String nome;
    private int cpf;

    public Pessoa(Date nascimento, String nome, int cpf) {
        this.nascimento = nascimento;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void calcularIdade() {
        Calendar hoje = Calendar.getInstance();
        Calendar nasc = Calendar.getInstance();
        nasc.setTime(nascimento);

        int idade = hoje.get(Calendar.YEAR) - nasc.get(Calendar.YEAR);

        if (hoje.get(Calendar.DAY_OF_YEAR) < nasc.get(Calendar.DAY_OF_YEAR)) {
            idade--;
        }

        System.out.println(nome + " tem " + idade + " anos.");
    }
}
