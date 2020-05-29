import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Functions {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Input min: ");
        // byte inputMin = scanner.nextByte();
        // System.out.print("Input max: ");
        // byte inputMax = scanner.nextByte();

        // System.out.println(generateArrayFromRange(inputMin, inputMax));

        System.out.println(includesArray(1));
    }

    public static ArrayList<Integer> generateArrayFromRange(int inputMin, int inputMax) {
        if (inputMin < inputMax) {
            ArrayList<Integer> numbers = new ArrayList<Integer>();

            for (int i = inputMin; i <= inputMax; i++) {
                numbers.add(i);
            }

            // numbers.forEach(item -> {

            // });

            return numbers;
        }

        return new ArrayList<Integer>();
    }

    public static boolean includesArray(int item) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // for (int i = 0; i < numbers.length; i++) {
        // if (numbers[i] == item)
        // return true;
        // }

        for (int i : numbers) {
            if (i == item)
                return true;
        }

        return false;
    }

}

// Step 1: declare panjang array
// range = (input max - input min) + 1

// for i = 0; i < range; i ++