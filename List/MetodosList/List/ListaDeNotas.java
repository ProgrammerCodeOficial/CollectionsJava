import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Crie uma lista e adicione 7 notas

public class ListaDeNotas {
    public static void main(String[] args) {

        // Exemplos de methodos

        System.out.println(" Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println(" ==============================================");

        System.out.println(" Exibindo a posição da nota 5.0 : " + notas.indexOf(5d));

        System.out.println(" ==============================================");

        System.out.println(" Adicione na lista a nota 8.0 na posição 4 ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println(" ==============================================");

        System.out.println(" Substitua a nota 5.0 pela nota 6.0 ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println(" ==============================================");

        System.out.println(" Confira se a nota 5.0 está na lista:  " + notas.contains(5d));

        System.out.println(" ==============================================");

        System.out.println(" Exiba todas as notas na ordem em que foram informado: ");
        for (Double nota : notas)
            System.out.println(nota);

        System.out.println(" ==============================================");

        System.out.println(" Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println(" ==============================================");

        // A classe Double extends number implements Comparable

        System.out.println(" Exiba a menor nota: " + Collections.min(notas));

        System.out.println(" ==============================================");

        // A classe Double extends number implements Comparable

        System.out.println(" Exiba a maior nota: " + Collections.max(notas));

        System.out.println(" ==============================================");

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(" Exiba a soma dos valores: " + soma);

        System.out.println(" ==============================================");

        System.out.println(" Exiba a média das notas: " + soma / notas.size());

        System.out.println(" ==============================================");

        System.out.println(" Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println(" ==============================================");

        System.out.println(" Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println(" ==============================================");

        System.out.println(" Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7)
                iterator1.remove();
        }
        System.out.println(notas);

        System.out.println(" ==============================================");

        System.out.println(" Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println(" ==============================================");

        System.out.println(" Confira se a lista está vazia: " + notas.isEmpty());

        System.out.println(" ==============================================");
        // Metodo implementacao LinkedList

        System.out.println(
                " Crie uma lista chamada notas2 e coloque todos os elementos da list Arraylist nessa nova lista");

        LinkedList<Double> notas2 = new LinkedList<Double>();

        notas2.add(1.0);
        notas2.add(2.0);
        notas2.add(3.0);
        notas2.add(4.0);
        notas2.add(5.0);
        notas2.add(6.0);
        notas2.add(7.0);

        System.out.println(" - A lista 2 é: " + notas2.toString());

        System.out.println(" ==============================================");

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo");
        Double value = notas2.element();
        System.out.println(value);

        System.out.println(" ==============================================");

        System.out.println("Mostre a primeira nota da nova lista removendo-o");

        notas2.removeFirst();
        System.out.println(notas2);

        System.out.println(" ==============================================");
    }
}