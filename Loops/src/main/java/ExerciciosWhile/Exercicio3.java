package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, menor21 = 0, maior50 = 0;

        System.out.println("Digite uma idade: ");
        num = input.nextInt();

        while (num >= 0) {
            if(num > 50) maior50++;
            if(num < 21) menor21++;
            System.out.println("Digite uma idade: ");
            num = input.nextInt();
        }

        System.out.println("Total de pessoas menores de 21 anos: " + menor21);
        System.out.println("Total de pessoas maiores de 50 anos: " + maior50);
    }

}
