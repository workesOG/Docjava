package grundprogrammering.metoder;

public class ArrayManipulation {
    // Opgave 8
    public int[] inc(int[] array) {
        int[] incArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            incArray[i] = array[i] + 1;
        }
        return incArray;
    }


    // Opgave 9
    public int[] add(int[] targetArray, int[] sourceArray) {
        if (targetArray.length != sourceArray.length) {
            System.out.println("Arrays must be of the same length");
            return targetArray;
        }
        int[] newTargetArray = new int[targetArray.length];

        for (int i = 0; i < targetArray.length; i++) {
            newTargetArray[i] = targetArray[i] + sourceArray[i];
        }

        return newTargetArray;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? "-" : ""));
        }
    }

}
