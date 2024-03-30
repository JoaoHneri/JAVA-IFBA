package exr4;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temperatura = 0;
        System.out.println("Olá já mediu sua temperatura ? \nPor favor, insira ela aqui abaixo: Ex: 35,5 C°");
        temperatura = sc.nextFloat();
        if(temperatura > 37){
            System.out.println("Você está com febre, por favor se cuide bem ou vá a um médico!");
        }else {
            System.out.println("Sua temperatura está comum, mas cuide e fique alerta, caso suba faça o teste novamente, ou vá a um médico!");
        }

        sc.close();

    }
}
