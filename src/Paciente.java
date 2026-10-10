import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Classe Paciente que representa um paciente com seus dados pessoais e registros de sinais vitais

public class Paciente {
    private String nome;
    private int numeroAtendimento;
    private LocalDate dataNascimento;
    private List<SinaisVitais> registros = new ArrayList<>();

    //Construtor da classe Paciente que inicializa os atributos com os valores fornecidos

    public Paciente(String nome, int numeroAtendimento, LocalDate dataNascimento) {
        // Validações para garantir que os dados do paciente sejam válidos
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome do paciente não pode ser nulo ou vazio.");
        }
        if(numeroAtendimento <= 0){
            throw new IllegalArgumentException("Número de atendimento deve ser maior que zero.");
        }
        if(dataNascimento == null || dataNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data de nascimento inválida.");
        }

        this.nome = nome;
        this.numeroAtendimento = numeroAtendimento;
        this.dataNascimento = dataNascimento;
    }
    // Método para adicionar um registro de sinais vitais à lista de registros do paciente
    public void adicionarSinaisVitais(SinaisVitais sinaisVitais) {
        if (sinaisVitais == null) {
            throw new IllegalArgumentException("Registro de sinais vitais não pode ser nulo.");
        }
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
    // Método para obter a lista de registros de sinais vitais do paciente
    public List<SinaisVitais> getRegistros() {
        return registros;
    }
}
