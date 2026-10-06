import java.time.LocalDate;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente paciente1 = new Paciente("João", 123, LocalDate.of(1990, 5, 15));
        System.out.println("Nome: " + paciente1.getNome());
        System.out.println("Número de Atendimento: " + paciente1.getNumeroAtendimento());
        System.out.println("Data de Nascimento: " + paciente1.getDataNascimento());

        SinaisVitais sinaisVitais1 = new SinaisVitais(100, 65, 70, 20, 36.5, 98, 100, 70.0, 170.0,
                LocalDateTime.of(2026, 10, 6, 8, 0));
        paciente1.adicionarSinaisVitais(sinaisVitais1);
        imprimirSinais(sinaisVitais1);

        Paciente paciente2 = new Paciente("Leandro", 567, LocalDate.of(1985, 10, 20));
        SinaisVitais registro1 = new SinaisVitais(110, 80, 75, 18, 37.0, 97, 90, 80.0, 180.0,
                LocalDateTime.of(2026, 10, 6, 8, 0));
        SinaisVitais registro2 = new SinaisVitais(115, 85, 80, 20, 37.5, 98, 95, 85.0, 185.0,
                LocalDateTime.of(2026, 10, 6, 14, 0));
        paciente2.adicionarSinaisVitais(registro1);
        paciente2.adicionarSinaisVitais(registro2);

        System.out.println("Paciente: " + paciente2.getNome());
        for (SinaisVitais registro : paciente2.getRegistros()) {
            imprimirSinais(registro);
        }
    }

    public static void imprimirSinais(SinaisVitais registro) {
        System.out.println("Pressão Sistólica: " + registro.getPressaoSistolica() + " mmHg");
        System.out.println("Pressão Diastólica: " + registro.getPressaoDiastolica() + " mmHg");
        System.out.println("Pressão Arterial Média: " + registro.calcularPAM() + " mmHg");
        System.out.println("Frequência Cardíaca: " + registro.getFrequenciaCardiaca() + " bpm");
        System.out.println("Frequência Respiratória: " + registro.getFrequenciaRespiratoria() + " irpm");
        System.out.println("Temperatura Corporal: " + registro.getTemperaturaCorporal() + " °C");
        System.out.println("Saturação de Oxigênio: " + registro.getSaturacaoOxigenio() + " %");
        System.out.println("Glicemia Capilar: " + registro.getGlicemiaCapilar() + " mg/dL");
        System.out.println("Peso: " + registro.getPeso() + " kg");
        System.out.println("Altura: " + registro.getAlturaCm() + " cm");
        System.out.println("Data e Hora do Registro: " + registro.getDataHoraRegistro());
        System.out.println("-----");
    }
}