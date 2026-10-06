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

        Paciente paciente2 = new Paciente("Leandro", 567, LocalDate.of(1985, 10, 20));
        SinaisVitais registro1= new SinaisVitais(110,80, 75, 18, 37.0, 97, 90, 80.0, 180.0, LocalDateTime.now());
        SinaisVitais registro2= new SinaisVitais(115,85, 80, 20, 37.5, 98, 95, 85.0, 185.0, LocalDateTime.now());
        paciente2.adicionarSinaisVitais(registro1);
        paciente2.adicionarSinaisVitais(registro2);
        System.out.println("Paciente:" + paciente2.getNome());
        for(SinaisVitais registro : paciente2.getRegistros()){
            System.out.println("Pressão Sistólica: " + registro.getPressaoSistolica() + " mmHg");
            System.out.println("Pressão Diastólica: " + registro.getPressaoDiastolica() + " mmHg");
            System.out.println("Frequência Cardíaca: " + registro.getFrequenciaCardiaca() + " bpm");
            System.out.println("Frequência Respiratória: " + registro.getFrequenciaRespiratoria() + " mpm");
            System.out.println("Temperatura Corporal: " + registro.getTemperaturaCorporal() + " °C");
            System.out.println("Saturação de Oxigênio: " + registro.getSaturacaoOxigenio() + " %");
            System.out.println("Glicemia Capilar: " + registro.getGlicemiaCapilar() + " mg/dL");
            System.out.println("Peso: " + registro.getPeso() + " kg");
            System.out.println("Altura (cm): " + registro.getAlturaCm() + " cm");
            System.out.println("Data e Hora do Registro: " + registro.getDataHoraRegistro());

        }

    }
}