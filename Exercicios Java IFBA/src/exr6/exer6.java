package exr6;

import java.util.Locale;
import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1 = 0.0;
        double nota2 = 0.0;
        double media = 0.0;
        System.out.println("Digite o valor da nota da primeira avaliação: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite o valor da nota da segunda avaliação: ");
        nota2 = sc.nextDouble();
        media = (nota1+nota2)/2;

        System.out.println("Sua média é: " + media + " e você foi: ");

        if(media >= 7){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado...");
        }

        sc.close();

    }


}
