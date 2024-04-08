import Carro.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Nissan");

        carro.ligar();
        carro.acelerar();
        carro.aumentarMarcha();
        carro.virarParaDireita();
        System.out.println(carro.toString());

        System.out.println("\n");]
        
        carro.desacelerar();
        carro.virarParaEsquerda();
        carro.diminuirMarcha();
        carro.desligar();
        System.out.println(carro.toString());


    }
}