package stream_api;

import java.util.Arrays;
import java.util.List;

public class Challenge_19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30, 45, 60, 65);

        int somaNumeros = numeros.stream()
                .distinct()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("A soma dos números divisiveis por 3 e 5 é: " + somaNumeros);
    }
}
