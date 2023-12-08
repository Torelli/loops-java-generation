package ExerciciosDoWhile;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, total = 0;
        float media = 0;

        do{
            System.out.println("Digite um número: ");
            num = input.nextInt();
            if(num % 3 == 0 && num != 0) {
                media += num;
                total++;
            }
        }while(num != 0);

        media /= total;

        System.out.println("A média de todos os números múltiplos de 3 é: " + String.format("%.1f",media));
    }

}
