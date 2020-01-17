public class Colection {
    private int values[] = { 10, 11, 12, 13, 14, 15, 16 };

    public int sequentialSearch(int val) {
        int pos;
        for (pos = 0; pos < values.length; pos++) {
            if (val == values[pos]) {
                return pos; // return were element localization is
            }
        }
        return -1; // not found element
    }
}