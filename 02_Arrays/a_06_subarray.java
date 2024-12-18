public class a_06_subarray {
    public static void printSubArrays(int num[]) {
        int total = 0;
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { // print
                    System.out.print(num[k] + " "); // subarrays
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total SubArrays = " + total);
    }

    public static void main(String args[]) {
        int num[] = { 2, 4, 6, 8, 10 };
        printSubArrays(num);
    }
}
