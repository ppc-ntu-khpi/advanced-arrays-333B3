package domain;

import java.util.Arrays;
import java.util.Random;

/**
 * Клас Main надає методи для роботи з матрицями.
 */
public class Main {

    /**
     * Приватний конструктор для заборони створення екземплярів класу.
     */
    private Main() {}

    /**
     * Метод для генерації рандомної матриці заданого розміру.
     * Кожен елемент матриці є випадковим цілим числом в діапазоні [0, 99].
     *
     * @param rows    кількість рядків у матриці
     * @param columns кількість стовпців у матриці
     * @return        згенерована рандомна матриця
     */
    public static int[][] generateRandomMatrix(int rows, int columns) {
        Random random = new Random();
        return random.ints(rows, 0, 100)
                .mapToObj(row -> random.ints(columns, 0, 100).toArray())
                .toArray(int[][]::new);
    }

    /**
     * Метод для знаходження максимального елемента у заданому рядку матриці.
     *
     * @param row рядок матриці
     * @return    максимальний елемент у рядку
     */
    private static int findMaxElementInRow(int[] row) {
        return Arrays.stream(row).max().orElse(Integer.MIN_VALUE);
    }

    /**
     * Метод для знаходження максимальних елементів у кожному рядку заданої матриці.
     *
     * @param matrix матриця
     * @return       масив максимальних елементів у рядках матриці
     */
    public static int[] findMaxElements(int[][] matrix) {
        return Arrays.stream(matrix)
                .mapToInt(Main::findMaxElementInRow)
                .toArray();
    }
}
