package exr3;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade = 0;
        System.out.println("Por favor digite sua idade para sabermos se está apto para tirar sua CNH: ");
        idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Parabéns você já é de maior e já pode tirar sua CNH");
        }else {
            System.out.println("Desculpe, você ainda não está na idade de tirar a sua CNH, falta apenas: " + (18 - idade) + " anos para você estar apto!" );

        }

        sc.close();

    }
}
