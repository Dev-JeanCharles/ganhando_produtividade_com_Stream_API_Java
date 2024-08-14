package stream_api;

import java.util.Arrays;
import java.util.List;

public class Challenge_8 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 21);

        int somaDosDigitos = numeros.stream()
                .map(String::valueOf)
                .flatMapToInt(String::chars)
                .map(Character::getNumericValue)
                .sum();

        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDosDigitos);
    }
}
