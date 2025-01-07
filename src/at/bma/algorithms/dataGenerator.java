package at.bma.algorithms;

import java.util.Random;

//int bedeutet rückgabewert/typ
//int (parameter)

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }

    public static int[] generateDataArray(int size, int min, int max) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(max-min) + min+1;
        }
        return data;
    }

    //data sind ganze zahlen in einem array
    //muss in einem bestimmten bereich liegen
    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}

