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
        
        // Calculate sum and average
        int sum = 0;
        for (int value : table) {
            sum += value;
        }
        double average = (double) sum / table.length;
        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
    }
}