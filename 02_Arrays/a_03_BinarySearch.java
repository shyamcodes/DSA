public class a_03_BinarySearch {
    public static int binary_search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = start + 1;
            } else { // left
                end = end - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 8, 6, 9, 7 };
        int key = 4;
        System.out.println("Index of key is: " + binary_search(numbers, key));
    }
}
