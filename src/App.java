import java.time.LocalDate;
public class App {
    public static void main(String[] args) throws Exception {
        Paciente paciente1 = new Paciente("João", 123, LocalDate.of(1990, 5, 15));
        System.out.println("Nome: " + paciente1.getNome());
        System.out.println("Número de Atendimento: " + paciente1.getNumeroAtendimento());
        System.out.println("Data de Nascimento: " + paciente1.getDataNascimento());
    }
}
