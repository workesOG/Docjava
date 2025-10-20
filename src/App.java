import grundprogrammering.metoder.ArrayManipulation;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayManipulation arrayManipulation = new ArrayManipulation();
        int[] array1 = { 9, 24, 37, 42, 51, 63, 72, 81, 27, 44 };
        int[] array2 = { 61, 42, 84, 75, 3, 57, 54, 39, 20, 11 };
        int[] result = arrayManipulation.add(array1, array2);
        
        System.out.println();
        arrayManipulation.printArray(array1);
        System.out.println();
        arrayManipulation.printArray(array2);
        System.out.println();
        arrayManipulation.printArray(result);
    }
}
