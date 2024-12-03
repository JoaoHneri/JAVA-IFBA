package exr2;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precoLitro = 0.0;
        int kmFazenda = 0;
        int mediaKm = 12;
        int quantidadeGasolina = 0;
        double precoGaso = 0.0;

        System.out.println("Informe quantos Km's será percorrido de seu local atual até a fazenda: ");
        kmFazenda = sc.nextInt();
        System.out.println("Agora informe o Preço do litro da gasolina: ");
        precoLitro = sc.nextDouble();
        quantidadeGasolina = kmFazenda / mediaKm;
        precoGaso = quantidadeGasolina * precoLitro;
        System.out.println("A quantidade de gasolina que você gastará nesse trajeto é de: " + quantidadeGasolina + "\n" +
                " E o preço que você gastará em gasolina nesse trajeto é de: " + precoGaso);
        sc.close();

    }
}
