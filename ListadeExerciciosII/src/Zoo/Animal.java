package Zoo;

public class Animal {
    private String especie;
    private String dataNascimento; // Alteração para String
    private String nome;
    private int numeroRegistro;
    private String localNascimento;

    public Animal() {
    }

    public Animal(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public void cadastrar(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        this.especie = especie;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
        this.localNascimento = localNascimento;
    }

    public void alterar(String especie, String dataNascimento, String nome, int numeroRegistro, String localNascimento) {
        cadastrar(especie, dataNascimento, nome, numeroRegistro, localNascimento);
    }


    public void imprimirInformacoes() {
        System.out.println("Espécie: " + especie);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Nome: " + nome);
        System.out.println("Número de Registro: " + numeroRegistro);
        System.out.println("Local de Nascimento: " + localNascimento);
    }



}
