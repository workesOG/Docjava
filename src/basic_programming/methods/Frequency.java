package basic_programming.methods;

// Opgave 20
public class Frequency {
    public int frequency(int[] array, int target) {
        int frequency = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                frequency++;
            }
        }
        return array.length > 0 ? (int) (frequency * 100 / array.length) : 0;
    }

    public void printStatistics(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 9; i++) {
            int count = (int)((double)frequency(array, i) / 100 * array.length);
            sb.append(String.format("%d: %d%n", i, count));
        }
        System.out.println(sb.toString());
    }
}

/* Testkode for opgave 20
Frequency fq = new Frequency();
int[] array = {9, 3, 8, 2, 9, 9, 5, 1, 3, 0, 0, 1, 7, 0, 1, 7, 8, 9, 3, 5, 0, 4, 2, 8, 6, 2, 3, 2, 4, 4, 1, 7, 2, 5, 7, 0, 5, 6, 5, 2, 3, 9, 4, 3, 6, 9, 0, 9, 1, 7, 4, 3, 2, 9, 0, 7, 8, 4, 2, 4, 6, 8, 9, 4, 7, 2, 5, 0, 0, 1, 0, 9, 4, 6, 5, 9, 0, 7, 1, 5, 1, 9, 4, 1, 5, 2, 2, 7, 1, 3, 4, 4, 0, 1, 2, 8, 0, 2, 4, 9};
Utils.printArray(array);
System.out.println();
int target = 0;
int frequency = fq.frequency(array, target);
double percentage = (double) frequency / array.length * 100;
System.out.println(String.format("Frequency of %d: %d / %d - %.0f%%", target, frequency, array.length, percentage));
fq.printStatistics(array);

OUTPUT:
9-3-8-2-9-9-5-1-3-0-0-1-7-0-1-7-8-9-3-5-0-4-2-8-6-2-3-2-4-4-1-7-2-5-7-0-5-6-5-2-3-9-4-3-6-9-0-9-1-7-4-3-2-9-0-7-8-4-2-4-6-8-9-4-7-2-5-0-0-1-0-9-4-6-5-9-0-7-1-5-1-9-4-1-5-2-2-7-1-3-4-4-0-1-2-8-0-2-4-9
Frequency of 0: 13 / 100 - 13%
0: 13
1: 11
2: 13
3: 8
4: 13
5: 9
6: 5
7: 9
8: 6
9: 13
*/