package stream_api;

import java.util.Arrays;
import java.util.List;

public class Challenge_10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> resultado = numeros.stream()
                .distinct()
                .filter(n -> n % 2 != 0)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .toList();

        System.out.println("Ímpares múltiplos de 3 ou 5: " + resultado);
    }
}
