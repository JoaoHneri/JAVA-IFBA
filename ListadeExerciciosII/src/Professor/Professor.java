package Professor;

public class Professor {
    private String nome;
    private String titulacao;
    private String formacao;
    private int cargaHoraria;
    private double salario;
    private String descricaoDisciplinas;

    public Professor() {
    }

    public Professor(String nome, String titulacao, String formacao, int cargaHoraria, double salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.descricaoDisciplinas = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDescricaoDisciplinas() {
        return descricaoDisciplinas;
    }

    public void setDescricaoDisciplinas(String descricaoDisciplinas) {
        this.descricaoDisciplinas = descricaoDisciplinas;
    }

    public void cadastrar(String nome, String titulacao, String formacao, int cargaHoraria, double salario) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.formacao = formacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }

    public void alterar(String nome, String titulacao, String formacao, int cargaHoraria, double salario) {
        cadastrar(nome, titulacao, formacao, cargaHoraria, salario);
    }


    public void alterarDescricaoDisciplina(String novaDescricao) {
        this.descricaoDisciplinas = novaDescricao;
    }


    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Formação: " + formacao);
        System.out.println("Carga Horária: " + cargaHoraria);
        System.out.println("Salário: " + salario);
        System.out.println("Descrição das disciplinas: " + descricaoDisciplinas);
    }
}
