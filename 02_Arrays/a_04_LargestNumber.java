import java.util.*;

// LargestNumber in array

public class a_04_LargestNumber {
    public static int getLargestNum(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity abhi k lie largest bna dia
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest value is: "+ smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 3, 5 };
        int largest_value = getLargestNum(numbers);
        System.out.println("Largest value is: " + largest_value);

    }
}