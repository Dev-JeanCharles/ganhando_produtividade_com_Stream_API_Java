package stream_api;

import java.util.Arrays;
import java.util.List;

public class Challenge_9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        boolean resultado = numeros.stream()
                .distinct()
                .count() == numeros.size();

        System.out.println("Os números da listas são distintos? " + resultado);
    }
}
