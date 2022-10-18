package Set;

import java.util.LinkedHashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(10d, 6.5, 8.9, 10d, 9d, 0d, 2.4));
        System.out.println(notas.toString());

        // System.out.println("Exiba a posição da nota 10: ");
        // Qdo trabalahamos com Set não conseguimos fazer busca de acordo com a posicao
        // indexOf()

        // System.out.println(" Adicione na lista a nota 8.9 na posição 4: ");
        // Nao conseguimos trabalhar com posicao no metodo set

        // System.out.println(" Substitua a nota 8.9 pela 2.4: ");
        // Nao consigo fazer pq nao tem o metodo Set

        System.out.println("Confira se a nota 8.9 está no conjunto: " + notas.contains(8.9));

        // System.out.println(" Exiba a terceira nota adicionada ");
        // Nao consigo fazer pq nao tem o metodo Get

        System.out.println(" Exiba a menor nota: " + Collections.min(notas));

        System.out.println(" Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(" Exiba a soma dos valores: " + soma);

        System.out.println(" Exiba a média das notas: " + (soma / notas.size()));

        System.out.println(" Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        // System.out.println(" Remova a nota da posição 0: ");
        // Nao tem como trabalhar com indices
        System.out.println(" Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println(" Exiba todas as notas na ordem que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(10d);
        notas2.add(6.5);
        notas2.add(8.9);
        notas2.add(10d);
        notas2.add(9d);
        notas2.add(0d);
        notas2.add(2.4);
        System.out.println(notas2);

        System.out.println(" Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println(" Apaque todo o conjunto");
        notas.clear();
        System.out.println(" Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println(" Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println(" Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}
