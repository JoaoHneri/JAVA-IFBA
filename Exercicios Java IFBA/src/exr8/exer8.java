package exr8;

import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o raio da circunferência: ");
        double raio = scanner.nextDouble();
        double pi = 3.14;
        double area = pi * Math.pow(raio, 2);
        System.out.println("A área da circunferência é: " + area);
        scanner.close();
    }
}
