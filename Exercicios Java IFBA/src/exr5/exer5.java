package exr5;

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numUser1 = 0;
        int numUser2 = 0;

        System.out.println("Primeiro usuario insira o número por favor: ");
        numUser1 = sc.nextInt();
        System.out.println("Agora, Segundo usuario insira o número por favor: ");
        numUser2 = sc.nextInt();

        if(numUser1 > numUser2){
            System.out.println("O numeró do usuario 1 é maior do que o do usuario 2: " + numUser1 + " > " + numUser2);
        } else if (numUser2 > numUser1) {
            System.out.println("O numeró do usuario 2 é maior do que o do usuario 1: " + numUser2 + " > " + numUser1);
        } else if (numUser1 == numUser2) {
            System.out.println("Os números são iguais");
        }

        sc.close();

    }
}
