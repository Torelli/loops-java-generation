package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o primeiro número do intervalo: ");
        n1 = input.nextInt();

        System.out.println("Digite o segundo número do intervalo: ");
        n2 = input.nextInt();

        if(n1 > n2) {
            System.out.println("Intervalo inválido!");
        } else {
            for(int i = n1; i <= n2; i++) {
                if(i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }
    }

}
