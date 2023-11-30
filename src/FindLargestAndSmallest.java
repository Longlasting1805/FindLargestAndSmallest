import java.util.Scanner;

public class FindLargestAndSmallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Integers");

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        // Read and process each integer input
        for (int i = 0; i < 5; i++){
            System.out.print("Enter integer" + (i + 1) + ": ");
            int currentNumber = input.nextInt();

            // Update largest and smallest if necessary
            if (currentNumber > largest){
                largest = currentNumber;
            }
            if (currentNumber < smallest){
                smallest = currentNumber;
            }
        }

        System.out.println("Largest Integer: " + largest);
        System.out.println("Smallest Integer: " + smallest);
    }
}
