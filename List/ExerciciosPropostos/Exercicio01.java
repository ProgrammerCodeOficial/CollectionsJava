package List.ExerciciosPropostos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Faca um programa que receba a temperatura media dos 6 primeiros meses do ano e armazene-as em uma lista.
 * 
 * Apos isto, calcule a media semestral das temperaturas e mostre todas as temperaturas acima desta media,
 * e em que mes elas ocorreram (mostrar o mes por extenso: 1- Janeiro, 2 - Fevereiro, etc.)
 */

public class Exercicio01 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            List<Double> temperaturas = new ArrayList<Double>();

            // Adicionando as temperaturas na lista:
            int contador = 0;
            while (true) {
                if (contador == 6)
                    break;

                System.out.print("Digite a temperatura: ");
                double temp = scan.nextDouble();
                temperaturas.add(temp);
                contador++;
            }
            System.out.println("-----------------");

            // exibindo todas as temperaturas:
            System.out.print("Todas as temperaturas: ");
            temperaturas.forEach(t -> System.out.print(t + " "));

            // calculando e exibindo a média das temperaturas:
            double media = temperaturas.stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0d);
            System.out.printf("\nMédia das temperaturas: %.1f\n", media);

            // exibindo as temperaturas acima da média
            System.out.print("Temperaturas acima da média: ");
            temperaturas.stream()
                    .filter(t -> t > media)
                    .forEach(t -> System.out.printf("%.1f ", t));

            // exibindo o mês das temperaturas acima da média por extenso:
            System.out.println("\n\nMeses das temperaturas acima da média: ");
            Iterator<Double> iterator = temperaturas.iterator();

            contador = 0;
            while (iterator.hasNext()) {
                Double temp = iterator.next();
                if (temp > media) {
                    switch (contador) {
                        case (0):
                            System.out.printf("1 - janeiro: %.1f\n ", temp);
                            break;
                        case (1):
                            System.out.printf("2 - fevereiro: %.1f\n", temp);
                            break;
                        case (2):
                            System.out.printf("3 - março: %.1f\n", temp);
                            break;
                        case (3):
                            System.out.printf("4 - abril: %.1f\n", temp);
                            break;
                        case (4):
                            System.out.printf("5 - maio: %.1f\n", temp);
                            break;
                        case (5):
                            System.out.printf("6 - junho: %.1f\n", temp);
                            break;
                        default:
                            System.out.println("Não houve temperatura acima da média.");
                    }
                }
                contador++;
            }
        }
    }
}