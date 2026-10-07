// ADICIONA VALORES DE SINAIS VITAIS AO PACIENTE
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
// Classe SinaisVitais que representa os sinais vitais de um paciente
public class SinaisVitais {
    private int pressaoSistolica;
    private int pressaoDiastolica;
    private int frequenciaCardiaca;
    private int frequenciaRespiratoria;
    private double temperaturaCorporal;
    private int saturacaoOxigenio;
    private int glicemiaCapilar;
    private double peso;
    private double alturaCm;
    private LocalDateTime dataHoraRegistro;
    // Construtor da classe SinaisVitais que inicializa os atributos com os valores fornecidos
    public SinaisVitais(int pressaoSistolica, int pressaoDiastolica, int frequenciaCardiaca,
                       int frequenciaRespiratoria, double temperaturaCorporal, int saturacaoOxigenio,
                       int glicemiaCapilar, double peso, double alturaCm, LocalDateTime dataHoraRegistro) {
        // Inicializa os atributos da classe SinaisVitais com os valores fornecidos
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.frequenciaRespiratoria = frequenciaRespiratoria;
        this.temperaturaCorporal = temperaturaCorporal;
        this.saturacaoOxigenio = saturacaoOxigenio;
        this.glicemiaCapilar = glicemiaCapilar;
        this.peso = peso;
        this.alturaCm = alturaCm;
        this.dataHoraRegistro = dataHoraRegistro;
    }

    public List<String> verificarAlertas(){
        List<String> alertas = new ArrayList<>();
        if (pressaoSistolica <=90 || pressaoSistolica >=160){
            alertas.add("Alerta: Pressão Sistolica fora do intervalo normal.");
        }
        if (pressaoDiastolica <=60 || pressaoDiastolica >=110){
            alertas.add("Alerta: Pressão Diastólica fora do intervalo normal.");
        }
        if (frequenciaCardiaca <=40 || frequenciaCardiaca >=120){
            alertas.add("Alerta: Frequência Cardíaca fora do intervalo normal.");
        }
        if (frequenciaRespiratoria <=8 || frequenciaRespiratoria >=28){
            alertas.add("Alerta: Frequência Respiratória fora do intervalo normal.");
        }
        if (temperaturaCorporal <=36.2 || temperaturaCorporal >=38.3){
            alertas.add("Alerta: Temperatura Corporal fora do intervalo normal.");
        }
        if (saturacaoOxigenio <=94){
            alertas.add("Alerta: Saturação de Oxigênio fora do intervalo normal.");
        }
        if (glicemiaCapilar <=70 || glicemiaCapilar >=180){
            alertas.add("Alerta: Glicemia Capilar fora do intervalo normal.");
        }
        if(calcularPAM() <=65 || calcularPAM() >=110){
            alertas.add("Alerta: Pressão Arterial Média fora do intervalo normal.");
        }
        return alertas;
    }
    //getters
    public int getPressaoSistolica() {
        return pressaoSistolica;
    }
    public int getPressaoDiastolica() {
        return pressaoDiastolica;
    }
    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }
    public int getFrequenciaRespiratoria() {
        return frequenciaRespiratoria;
    }
    public double getTemperaturaCorporal() {
        return temperaturaCorporal;
    }
    public int getSaturacaoOxigenio() {
        return saturacaoOxigenio;
    }
    public int getGlicemiaCapilar() {
        return glicemiaCapilar;
    }
    public double getPeso() {
        return peso;
    }
    public double getAlturaCm() {
        return alturaCm;
    }
    public LocalDateTime getDataHoraRegistro() {
        return dataHoraRegistro;
    }
    //PAM SEM ARREDONDAMENTO
    public int calcularPAM() {
        return (pressaoSistolica + 2 * pressaoDiastolica) / 3; 
    }
}
