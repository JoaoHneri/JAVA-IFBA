package exr7;

import java.util.Locale;
import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double altura = 0.0;
        double peso = 0.0;
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();


        double imc = peso/Math.pow(altura, 2);
        System.out.println("Seu Índice de Massa corporal é de: " + String.format("%.2f", imc));

        if(imc > 30){
            System.out.println("Você está obeso, vamos praticar exercicios fisicos para melhorar nossa saude!");
        }else {
            System.out.println("Você não está obeso, mas sempre é bom cuidar da saúde");
        }

        sc.close();

    }
}
