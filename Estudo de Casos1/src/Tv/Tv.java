package Tv;

public class Tv {
    private int tamanho;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;

    public Tv() {
    }

    public Tv(int tamanho, String marca, int voltagem, int canal) {
        this.tamanho = tamanho;
        this.volume = 5;
        this.marca = marca;
        this.voltagem = verificarVoltagem(voltagem);
        this.canal = canal;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }


    public void ligarTv(){
        int consumo = (this.voltagem * this.tamanho);
        System.out.println("Ligando a Tv" + "Consumo: "+ consumo);
    }

    public void desligarTv(){
        System.out.println("Desligando TV");
    }
    public void aumentarVolume(){
        if(this.volume == 0){
            System.out.println("Menor volume Atingido");
        }else if (this.volume == 10){
            System.out.println("Maior volume atingido");
        }else {
            setVolume(getVolume()+1);
        }
    }

    public void diminuirVolume(){
        if(this.volume == 0){
            System.out.println("Menor volume Atingido");
        }else {
            setVolume(getVolume() - 1);
        }
    }

    public void aumentarCanal(){
        setCanal(getCanal()+1);
    }

    public void diminuirCanal(){
        if (this.canal == 0){
            System.out.println("Ultimo canal");
        }else{
            setCanal(getCanal()-1);
        }

    }

    private int verificarVoltagem(int voltagem) throws IllegalArgumentException {
        if (voltagem != 110 && voltagem != 220) {
            throw new IllegalArgumentException("Voltagem inválida: " + voltagem + ". A voltagem deve ser 110 ou 220.");
        }
        return voltagem;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "tamanho=" + tamanho +
                ", volume=" + volume +
                ", marca='" + marca + '\'' +
                ", voltagem=" + voltagem +
                ", canal=" + canal +
                '}';
    }
}
