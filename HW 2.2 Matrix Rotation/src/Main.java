import java.util.Scanner;
import java.util.Random;

public class Main {
    public static final int SIZE = 8;
    public static int[][] colors = new int[SIZE][SIZE];
    public static int[][] rotColors = new int[SIZE][SIZE];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i, j;
        int choice;
        for (i = 0; i < SIZE; i++) {
            for (j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Matrix before rotation");
        showMatrix(colors);
        System.out.println("\nSelect degree: 90, 180, 270");
        System.out.print(">>");
        choice = scanner.nextInt();
        switch (choice) {
            case 90:
                for (i = 0; i < SIZE; i++) {
                    for (j = 0; j < SIZE; j++) {
                        rotColors[j][SIZE - 1 - i] = colors[i][j];
                    }
                }
                break;
            case 180:
                for (i = 0; i < SIZE; i++) {
                    for (j = 0; j < SIZE; j++) {
                        rotColors[SIZE - 1 - i][SIZE - 1 - j] = colors[i][j];
                    }
                }
                break;
            case 270:
                for (i = 0; i < SIZE; i++) {
                    for (j = 0; j < SIZE; j++) {
                        rotColors[SIZE - 1 - j][i] = colors[i][j];
                    }
                }
        }
        System.out.println("\nMatrix after rotation");
        showMatrix(rotColors);
    }

    public static void showMatrix(int matrix[][]) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", matrix[i][j]);
            }
            System.out.println();
        }

    }
}
