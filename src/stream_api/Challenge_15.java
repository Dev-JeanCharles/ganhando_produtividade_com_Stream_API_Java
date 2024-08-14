package stream_api;

import java.util.Arrays;
import java.util.List;

public class Challenge_15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean contemNumeroNegativo = numeros.stream()
                .anyMatch(n -> n < 0);

        System.out.println("Contém pelo menos um número negativo? " + contemNumeroNegativo);
    }
}
