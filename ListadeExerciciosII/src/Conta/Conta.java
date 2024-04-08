package Conta;

public class Conta {
    private String nome;
    private String RG;
    private String CPF;
    private double saldo;
    private int numeroDaConta;
    private int agencia;

    public Conta() {
    }

    public Conta(String nome, String RG, String CPF, double saldo, int numeroDaConta, int agencia) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void registrarConta(String nome, String RG, String CPF, double saldo, int numeroDaConta, int agencia){
        setNome(nome);
        setRG(RG);
        setCPF(CPF);
        setSaldo(saldo);
        setNumeroDaConta(numeroDaConta);
        setAgencia(agencia);
    }

    public void editarConta(String nome, String RG, String CPF, double saldo, int numeroDaConta, int agencia){
        registrarConta(nome, RG, CPF, saldo, numeroDaConta, agencia);
    }

    public void imprimirSaldo() {
        System.out.println("Saldo do Correntista " + nome + ": R$" + saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", RG='" + RG + '\'' +
                ", CPF='" + CPF + '\'' +
                ", saldo=" + saldo +
                ", numeroDaConta=" + numeroDaConta +
                ", agencia=" + agencia +
                '}';
    }
}
