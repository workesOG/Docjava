package basic_programming.methods;

// Opgave 19
public class CheckPairs {
    public ReturnData checkForPair(int[] array, int target1, int target2) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target1) {
                if (array[i + 1] == target2) {
                    return new ReturnData(true, i);
                }
            }
            if (array[i] == target2) {
                if (array[i + 1] == target1) {
                    return new ReturnData(true, i);
                }
            }
        }
        return new ReturnData(false, -1);
    }

    public class ReturnData
    {
        public boolean found;
        public int firstIndex;

        public ReturnData(boolean found, int firstIndex) {
            this.found = found;
            this.firstIndex = firstIndex;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (!found) {
                sb.append("Pair not found");
                return sb.toString();
            }
            sb.append("Pair found");
            sb.append(System.lineSeparator());
            sb.append(String.format("first index: %d", firstIndex));
            sb.append(System.lineSeparator());
            sb.append(String.format("second index: %d", firstIndex + 1));
            return sb.toString();
        }
    }
}

/* Testkode for opgave 19
CheckPairs cp = new CheckPairs();
int[] array = {8, 2, 5, 3, 4, 7, 6, 9, 10, 1};
Utils.printArray(array);
System.out.println();
rd = cp.checkForPair(array, 2, 5);
System.out.println(rd);

OUTPUT:
8-2-5-3-4-7-6-9-10-1
Pair found
first index: 1
second index: 2
*/