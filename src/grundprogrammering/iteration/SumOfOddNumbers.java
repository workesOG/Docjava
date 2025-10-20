package grundprogrammering.iteration;

// Opgave 6
public class SumOfOddNumbers {
    int intervalStart = 1;
    int intervalEnd = 20;

    public void printSumOfOddNumbers() {
        int sum = 0;
        for (int i = intervalStart; i <= intervalEnd; i++) {
            if (!isEven(i)) {
            sum += i;
            }
        }
        System.out.println(sum);
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
