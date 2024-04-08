package Calculadora;
import java.util.Scanner;
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();


        System.out.print("Digite a operação (soma, subtração, multiplicação, divisão): ");
        String operacao = scanner.next();


        double resultado = 0.0;
        switch (operacao.toLowerCase()) {
            case "soma":
                resultado = Calculadora.somar(num1, num2);
                break;
            case "subtração":
                resultado = Calculadora.subtrair(num1, num2);
                break;
            case "multiplicação":
                resultado = Calculadora.multiplicar(num1, num2);
                break;
            case "divisão":
                resultado = Calculadora.dividir(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }


        System.out.println("O resultado da operação " + operacao + " é: " + resultado);

        scanner.close();
    }

}
