package test;

import domain.*;

/**
 * Тестовий клас для перевірки роботи основного класу.
 */
public class Test {
    
    /**
     * Метод main для виведення результату роботи основного класу.
     * 
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        // Генеруємо рандомну матрицю розміром 3x3
        int[][] matrix = Main.generateRandomMatrix(3, 3);
        
        // Виводимо матрицю
        System.out.println("Згенерована матриця:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Знаходимо та виводимо максимальні елементи в кожному рядку матриці
        int[] maxElements = Main.findMaxElements(matrix);
        System.out.println("\nМаксимальні елементи в кожному рядку матриці:");
        for (int element : maxElements) {
            System.out.println(element);
        }
    }
}
