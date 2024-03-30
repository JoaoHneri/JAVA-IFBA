package exr1;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horasTrabalhadas = 0;
        double vPorHora = 20.0;
        System.out.println("Insira a quantidade de Horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextInt();
        double salario = horasTrabalhadas * vPorHora;
        System.out.println("O salário desse operário é de: " + salario + "Reais");
        sc.close();
    }
}
