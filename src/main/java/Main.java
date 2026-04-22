import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        // Initialize array with random values
        int[] table = new int[10];
        Random random = new Random();
        
        System.out.println("\nInitializing table with random values:");
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(100); // Random values from 0 to 99
            System.out.println("table[" + i + "] = " + table[i]);
        }
        
        int sum = 0;
        for (int value : table) {
            sum += value;
        }
        double average = (double) sum / table.length;
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        
        // Sort table using bubble sort
        bubbleSort(table);
        System.out.println("\nSorted table:");
        for (int value : table) {
            System.out.println(value);
        }
    }

    // Bubble sort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }