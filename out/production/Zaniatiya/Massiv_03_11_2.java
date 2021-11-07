import java.util.Arrays;
import java.util.Random;

// преобразовать массив в одномерный
public class Massiv_03_11_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[5][5];
        int[] array2 = new int[array.length* array[0].length];

        for (int i = 0, k = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++, k++) {
                array[i][j] = random.nextInt(100 + 50) - 50;
                System.out.print(array[i][j] + "   ");
                array2[k]=array[i][j];
            }
            System.out.println();
        }

        System.out.println(Arrays.toString(array2));
    }}
