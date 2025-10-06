package grundprogrammering.iteration;

public class OneDArrays {
    int Uneven[] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29 };
    int Even[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28 };
    int Table[] = { 5, 8, 1, 9, 3, 6, 2, 3, 9, 4, 7, 5, 7, 2, 0, 1, 0, 2 };
    int PositiveAndNegative[] = { 4, 9, -2, -6, 2, 6, -9, 4, 9, -1, 1, 0, -3, -3, 2, 7 };
    int T1[] = { 44, 71, 93, 24, 35, 21, 64 };
    int T2[] = { 32, 78, 12, 29, 21, 66, 92 };
    int T3[] = { 25, 54, 62, 10, 99, 45, 23 };
    int T4[] = { 36, 20, 71, 45, 94, 36, 41 };
    int T5[] = { 53, 34, 31, 88, 85, 90, 11 };

    public void PrintFirstUneven() {
        System.out.println(Uneven[0]);
    }

    public void PrintLengthPosNeg() {
        System.out.println(PositiveAndNegative.length);
    }

    public void PrintFirst5FromTable() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Table[i]);
        }
    }

    public void PrintAllFromT1() {
        for (int num : T1) {
            System.out.println(num);
        }
    }

    public void PrintMidAndLastFromT2() {
        int midIndex = Math.round(T2.length / 2);
        System.out.println(T2[midIndex]);
        System.out.println(T2[T2.length - 1]);
    }

    public void CalculateSumOfPosNeg() {
        int sum = 0;
        for (int num : PositiveAndNegative) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void PrintNegativeFromPosNeg() {
        for (int num : PositiveAndNegative) {
            if (num < 0) {
                System.out.println(num);
            }
        }
    }

    public void PrintInReverseOrderFromT3() {
        for (int i = T3.length - 1; i >= 0; i--) {
            System.out.println(T3[i]);
        }
    }

    public void ReplaceThreeFirstInT4FromT5() {
        for (int i = 0; i < 3; i++) {
            T4[i] = T5[T5.length - 3 + i];
        }
    }

    public void ReverseValuesInPosNeg() {
        for (int i = 0; i < PositiveAndNegative.length; i++) {
            PositiveAndNegative[i] = -PositiveAndNegative[i];
            if (i < 4 || i > PositiveAndNegative.length - 4) {
                System.out.println(PositiveAndNegative[i]);
            }
        }
    }

    public void PrintFromOneToTenFromArrays() {
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.println(Uneven[i]);
                continue;
            }
            System.out.println(Even[i]);
            System.out.println(Uneven[i]);
        }
    }

    public void ReverseValuesInT3() {
        int[] original = T3;
        for (int i = 0; i < T3.length; i++) {
            T3[i] = original[T3.length - 1 - i];
            System.out.println(T3[i]);
        }
    }

    
}
