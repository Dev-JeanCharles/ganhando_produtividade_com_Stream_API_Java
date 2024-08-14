package stream_api;

import java.util.Arrays;
import java.util.List;

public class Challenge_3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean resultado = numeros.stream()
                .distinct()
                .allMatch(n -> n > 0);

        System.out.println("Os números dessa lista são: "+ resultado);
    }
}
