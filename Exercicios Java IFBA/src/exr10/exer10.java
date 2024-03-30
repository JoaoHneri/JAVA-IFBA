package exr10;

import java.util.Locale;
import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        double soma = valor1 + valor2;

        if (soma > 10) {
            System.out.println("Resultado da soma: " + soma);
            System.out.println("A soma dos valores é maior que 10");

        } else {
            System.out.println("Resultado da soma: " + soma);
            System.out.println("A soma dos valores não é maior que 10.");
        }

        scanner.close();
    }
}

