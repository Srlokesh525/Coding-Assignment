Java 
    
1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
    
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an array with the values (1, 2, 3, 4, 5, 6, 7)
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7};

        // Convert the array to a list for shuffling
        List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));

        // Shuffle the list
        Collections.shuffle(numberList);

        // Print the shuffled list
        System.out.println("Shuffled Array: " + numberList);
    }
}

.................................................................................................................

2. Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
    
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Number: ");
        String romanNumeral = scanner.nextLine();

        int result = romanToInteger(romanNumeral);
        System.out.println("Integer value: " + result);
    }

    public static int romanToInteger(String s) {
        // Create a mapping of Roman numerals to their integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));

            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
}
.................................................................................................................
    
3.  Check if the input is pangram or not. (A pangram is a sentence that contains all the
    alphabets from A to Z)
    
import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        // Create an array to track the presence of each letter (A-Z)
        boolean[] alphabetPresent = new boolean[26];

        // Convert the sentence to lowercase for case-insensitive comparison
        sentence = sentence.toLowerCase();

        // Iterate through the sentence and mark each alphabet letter as present
        for (char c : sentence.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all alphabet letters are present
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
