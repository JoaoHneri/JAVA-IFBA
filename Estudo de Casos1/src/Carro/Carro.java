package Carro;

public class Carro {
    private String modelo;
    private int velocidade;
    private int aceleracao;
    private int marcha;

    public Carro() {
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
        this.aceleracao = 0;
        this.marcha = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(int aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public void ligar(){
        System.out.println("O carro está ligando");
    }

    public void desligar(){
        System.out.println("O carro está desligando");
    }

   public void acelerar(){
        setAceleracao(getAceleracao() + 1);
        setVelocidade(getVelocidade() + 1);
   }

    public void desacelerar(){
        setAceleracao(getAceleracao() - 1);
        setVelocidade(getVelocidade() - 1);
    }

    public void virarParaDireita(){
        System.out.println("Seta para direita ->");
        System.out.println("O carro está virando para direita");
    }

    public void virarParaEsquerda(){
        System.out.println("Seta para esquerda <-");
        System.out.println("O carro está virando para esquerda");
    }

    public void aumentarMarcha(){
        if(this.marcha == 5){
            System.out.println("Você já está na última marcha");
        }else {
            System.out.println("Passade de " + getMarcha() + "° " + "para " + (getMarcha()+1) + "° " + "marcha.");
            setMarcha(getMarcha() + 1);
        }
    }

    public void diminuirMarcha(){
        if(this.marcha == 0){
            System.out.println("Você já está em neutra");
        }else {
            System.out.println("Passade de " + getMarcha() + "° " + "para " + (getMarcha()-1) + "° " + "marcha.");
            setMarcha(getMarcha() - 1);

        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", marcha=" + marcha +
                '}';
    }
}
