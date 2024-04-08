package Carro;

public class Carro {
    private int codigo;
    private String marca;
    private String cor;
    private String modelo;
    private int anoDeFabricacao;
    private int numPortas;
    private String tipoCombustivel;
    private int quantidadeDisponivel;
    private double preco;
    private boolean completo;

    public Carro() {
    }

    public Carro(int codigo, String marca, String cor, String modelo, int anoDeFabricacao, int numPortas, String tipoCombustivel, int quantidadeDisponivel, double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isCompleto() {
        return completo;
    }

    public void setCompleto(boolean completo) {
        this.completo = completo;
    }

    public void cadastrar(int codigo, String marca, String cor, String modelo, int anoFabricacao,
                          int numPortas, String tipoCombustivel, int quantidadeDisponivel,
                          double preco, boolean completo) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoDeFabricacao = anoFabricacao;
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.preco = preco;
        this.completo = completo;
    }

    public void alterar(int codigo, String marca, String cor, String modelo, int anoFabricacao,
                        int numPortas, String tipoCombustivel, int quantidadeDisponivel,
                        double preco, boolean completo) {
        cadastrar(codigo, marca, cor, modelo, anoFabricacao, numPortas, tipoCombustivel,
                quantidadeDisponivel, preco, completo);
    }


    public String listar() {
        return "Carro{" +
                "codigo=" + codigo +
                ", marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoDeFabricacao=" + anoDeFabricacao +
                ", numPortas=" + numPortas +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                ", quantidadeDisponivel=" + quantidadeDisponivel +
                ", preco=" + preco +
                ", completo=" + completo +
                '}';
    }
}
