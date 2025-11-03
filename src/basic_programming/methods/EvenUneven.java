package basic_programming.methods;

// Opgave 17
public class EvenUneven {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isOdd(int number) {
        return !isEven(number);
    }

    public boolean swapEvenOdd(int[] array, int index1, int index2) {
        if (isOdd(array[index1]) || isEven(array[index2])) {
            return false;
        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return true;
    }
}

/* Testkode for opgave 17
EvenUneven eu = new EvenUneven();
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
Utils.printArray(array);
System.out.println();
eu.swapEvenOdd(array, 1, 4);
Utils.printArray(array);

OUTPUT:
1-2-3-4-5-6-7-8-9-10
1-5-3-4-2-6-7-8-9-10
 */