package service;

import java.util.List;


// Classe responsável por realizar cálculos em uma lista de elementos genéricos
public class CalculationService {

    // Método genérico que encontra o maior elemento em uma lista
    // O tipo genérico T deve ser comparável, ou seja, implementar Comparable<T>
    public static <T extends Comparable<T>> T max(List<T> list) {
        // Verifica se a lista está vazia, o que geraria um erro
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }

        // Assume que o primeiro elemento é o maior
        T max = list.get(0);

        // Percorre a lista para encontrar o maior valor
        for (T item : list) {
            // Se o item atual for maior que o máximo, atualiza o máximo
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        // Retorna o maior elemento
        return max;
    }
}
