import java.time.LocalDate;
import java.time.LocalDateTime;
public class App {
    public static void main(String[] args) throws Exception {
        Paciente paciente1 = new Paciente("João", 123, LocalDate.of(1990, 5, 15));
        System.out.println("Nome: " + paciente1.getNome());
        System.out.println("Número de Atendimento: " + paciente1.getNumeroAtendimento());
        System.out.println("Data de Nascimento: " + paciente1.getDataNascimento());

        SinaisVitais sinaisVitais1 = new SinaisVitais(100, 65, 70, 20, 36.5, 98, 100, 70.0, 170.0, LocalDateTime.now());
        System.out.println("Pressão Sistólica: " + sinaisVitais1.getPressaoSistolica() + " mmHg");
        System.out.println("Pressão Diastólica: " + sinaisVitais1.getPressaoDiastolica() + " mmHg");
        System.out.println("Frequência Cardíaca: " + sinaisVitais1.getFrequenciaCardiaca() + " bpm");
        System.out.println("Frequência Respiratória: " + sinaisVitais1.getFrequenciaRespiratoria() + " mpm");
        System.out.println("Temperatura Corporal: " + sinaisVitais1.getTemperaturaCorporal() + " °C");
        System.out.println("Saturação de Oxigênio: " + sinaisVitais1.getSaturacaoOxigenio() + " %");
        System.out.println("Glicemia Capilar: " + sinaisVitais1.getGlicemiaCapilar() + " mg/dL");
        System.out.println("Peso: " + sinaisVitais1.getPeso() + " kg");
        System.out.println("Altura (cm): " + sinaisVitais1.getAlturaCm() + " cm");
        System.out.println("Data e Hora do Registro: " + sinaisVitais1.getDataHoraRegistro());
        System.out.println("Pressão Arterial Média: " + sinaisVitais1.calcularPAM() + " mmHg");
    }
}