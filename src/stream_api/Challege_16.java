package stream_api;

import java.util.Arrays;
import java.util.List;

public class Challege_16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> numerosImpares = numeros.stream()
                .distinct()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("Lista de números Pares:\n" + numerosPares);
        System.out.println("Lista de números Ímpares:\n" + numerosImpares);
    }
}
