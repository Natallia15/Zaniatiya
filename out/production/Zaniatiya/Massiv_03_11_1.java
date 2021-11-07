import java.util.Random;

public class Massiv_03_11_1 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(100 + 50) - 50;
                System.out.print(array[i][j] + "   ");
            }
            System.out.println();
        }
        int m = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > m) {
                    m = array[i][j];
                }
            }

        }
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                if (j == array.length - 1 - i) {
                    n = n + array[i][j];
                }
            }

        }
        System.out.println("Максимальное число  " + m + " сумма по обратной диагонали " + n);
    }}
