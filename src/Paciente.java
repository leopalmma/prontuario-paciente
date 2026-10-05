import java.time.LocalDate;

public class Paciente {
    private String nome;
    private int numeroAtendimento;
    private LocalDate dataNascimento;

    public Paciente(String nome, int numeroAtendimento, LocalDate dataNascimento) {
        this.nome = nome;
        this.numeroAtendimento = numeroAtendimento;
        this.dataNascimento = dataNascimento;
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

}
