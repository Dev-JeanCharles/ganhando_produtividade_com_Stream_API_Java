package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Challenge_14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .filter(Challenge_14::isPrime)
                .max(Integer::compareTo);

        System.out.println("O maior número primo é: " + maiorNumeroPrimo.orElse(null));
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
