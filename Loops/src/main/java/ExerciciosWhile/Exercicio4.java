package ExerciciosWhile;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade, idGenero, dev, qtdBack = 0, qtdMFront = 0, qtdHMobileMaior40 = 0, qtdNBFullstackMenor30 = 0, total = 0;
        float media = 0;
        char continuar = 'S';

        while(continuar != 'N') {
            System.out.println("Idade: ");
            idade = input.nextInt();

            System.out.println("Identidade de Gênero: ");
            idGenero = input.nextInt();

            System.out.println("Pessoa Desenvolvedora: ");
            dev = input.nextInt();

            System.out.println("Deseja continuar (S/N)");
            continuar = input.next().charAt(0);

            if(dev == 1) qtdBack++;
            if(dev == 2 && (idGenero == 1 || idGenero == 4)) qtdMFront++;
            if(dev == 3 && (idGenero == 2 || idGenero == 5) && idade > 40) qtdHMobileMaior40++;
            if(dev == 4 && idGenero == 3 && idade < 30) qtdNBFullstackMenor30++;
            total++;
            media += idade;
        }

        media /= total;

        System.out.println("Total de pessoas desenvolvedoras Backend: " + qtdBack);
        System.out.println("\nTotal de mulheres Cis e Trans desenvolvedoras Frontend: " + qtdMFront);
        System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + qtdHMobileMaior40);
        System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + qtdNBFullstackMenor30);
        System.out.println("\nNúmero total de pessoas que responderam à pesquisa: " + total);
        System.out.println("A média de idade das pessoas que responderam à pesquisa: " + String.format("%.2f",media));
    }

}
