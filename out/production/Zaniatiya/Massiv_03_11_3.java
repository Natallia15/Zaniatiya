import java.util.Random;

// в каждой сторчке найти минимальный элемент
public class Massiv_03_11_3 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[5][5];
        int[] array2 = new int[array.length* array[0].length];

        for (int i = 0; i < array.length; i++) {
               for (int j = 0; j < array[0].length; j++ ) {
                array[i][j] = random.nextInt(100 + 50) - 50;
                System.out.print(array[i][j] + "   ");

            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            int minim = array[i][0];
            for (int j = 0; j < array[0].length; j++ ) {
                if (array[i][j]< minim){
                    minim = array[i][j];
                }

            }
            System.out.println(minim);
        }

    }}
