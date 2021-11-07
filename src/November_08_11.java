import java.util.Random;

public class Massiv_tab_um {
    public static void main(String[] args) {
        Random random = new Random();
        String[] finalArray = new String[15];
        int[] arrayA = new int[15];
        int[] arrayB = new int[15];
        for (int i = 0; i < 15; i++) {
            arrayA[i] = random.nextInt(7) + 2;
            arrayB[i] = random.nextInt(7) + 2;
            for (int j = i - 1; j >= 0; j--) {
                if ((arrayA[i] == arrayA[j] && arrayB[i] == arrayB[j]) || (arrayA[i] == arrayB[j] && arrayA[j] == arrayB[i])) {
                    arrayA[i] = random.nextInt(7) + 2;
                    arrayB[i] = random.nextInt(7) + 2;
                    j++;

                }
            }
            finalArray[i] = arrayA[i] + " * " + arrayB[i] + " = " + arrayA[i] * arrayB[i] + "  ";
        }
        for (int i = 0; i < 15; i++) {
            System.out.println(finalArray[i]);
        }

    }

}
