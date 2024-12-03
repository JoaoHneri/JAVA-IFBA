package exr9;

import java.util.Locale;
import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double valorHoraAula = 0;
        int horasTrabalhadasMes = 0;
        double percentDesconto = 0;
        double salarioBruto = 0;
        double salarioLiquido = 0;

        System.out.println("Qual o valor da hora aula do professor(a) ?: ");
        valorHoraAula = sc.nextDouble();

        System.out.println("Qual o  número de horas Trabalhadas no Mês desse professor(a) ?: ");
        horasTrabalhadasMes = sc.nextInt();

        System.out.println("Qual o o percentual de desconto do INSS desse professor(a) ?: (Dê o valor em porcentagem)");
        percentDesconto= sc.nextDouble();

        salarioBruto = valorHoraAula * horasTrabalhadasMes;

        salarioLiquido = salarioBruto - (salarioBruto * (percentDesconto / 100));
        System.out.println("O salário bruto desse professor é de: R$" + String.format("%.2f", salarioBruto) +
                ", mas com o abatimento do INSS, seu salario liquido é de: R$" + String.format("%.2f", salarioLiquido));

        sc.close();
    }
}
