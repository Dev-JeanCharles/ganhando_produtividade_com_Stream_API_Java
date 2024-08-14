package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Challenge_5 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
                .distinct()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average();

        if (media.isPresent()) {
            System.out.println("A média dos números é: " + media.getAsDouble());
        }
        else {
            System.out.println("Não existe números maiores que 5 na lista");
        }
    }
}
