public class Colection {
    private int values[] = { 11, 12, 23, 27, 33, 43, 56, 76, 87, 96 };

    public int sequentialSearch(int val) {
        int pos;
        for (pos = 0; pos < values.length; pos++) {
            if (val == values[pos]) {
                return pos; // return were element localization is
            }
        }
        return -1; // not found element
    }

    // binarySearch
    public int binarySearch(int value) {
        int middle, start, end;
        start = 0;
        end = values.length - 1;

        while (start < end) {
            middle = (start + end) / 2;
            // debbug
            // System.out.println("DEBBUG - S:" + start + " E:" + end + " M:" + middle);
            if (value == values[middle]) {
                return middle;
            } else {
                if (value > values[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}