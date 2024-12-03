package exr11;

import java.util.Locale;
import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();


        double soma = valor1 + valor2;


        if (soma >= 10) {
            soma += 5;
        } else {
            soma -= 7;
        }

        System.out.println("O resultado é: " + soma);
        scanner.close();
    }
}

