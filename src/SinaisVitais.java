// ADICIONA VALORES DE SINAIS VITAIS AO PACIENTE
import java.time.LocalDateTime;
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
    //getters
    }
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
