import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Paciente {
    private String nome;
    private int numeroAtendimento;
    private LocalDate dataNascimento;
    private List<SinaisVitais> registros = new ArrayList<>();
    public Paciente(String nome, int numeroAtendimento, LocalDate dataNascimento) {
        this.nome = nome;
        this.numeroAtendimento = numeroAtendimento;
        this.dataNascimento = dataNascimento;
    }
    public void adicionarSinaisVitais(SinaisVitais sinaisVitais) {
        registros.add(sinaisVitais);
    }
    public String getNome(){
        return nome;
    }
    public int getNumeroAtendimento(){
        return numeroAtendimento;
    }
    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public List<SinaisVitais> getRegistros() {
        return registros;
    }
}
