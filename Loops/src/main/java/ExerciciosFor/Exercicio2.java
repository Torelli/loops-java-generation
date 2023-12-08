package ExerciciosFor;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int pares = 0, impares = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "ª número: ");
            num = input.nextInt();
            if(num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Total de números pares: " + pares);
        System.out.println("Total de números ímpares: " + impares);
    }

}
