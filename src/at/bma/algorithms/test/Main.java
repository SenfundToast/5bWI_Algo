package at.bma.algorithms.test;

import at.bma.algorithms.DataGenerator;

public class Main {
    public static void main(String[] args) {
        //erstellen eines variablen, array 
        //int[] datentyp von ganzen zahlen 
        int[] array = DataGenerator.generateDataArray(10,1,5);
        DataGenerator.printArray(array);
    }
}
