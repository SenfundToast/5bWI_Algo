package at.bma.algorithms;

public class Main {
    public static void main(String[] args) {
        //erstellen eines variablen, array 
        //int[] datentyp von ganzen zahlen 
        int[] array = DataGenerator.generateDataArray(5,1,5);
        DataGenerator.printArray(array);
    }
}
