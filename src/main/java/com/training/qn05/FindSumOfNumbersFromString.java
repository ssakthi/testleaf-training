package main.java.com.training.qn05;

public class FindSumOfNumbersFromString {

    // Find the sum of the numbers in the given input string array
    // Input:{“2AA”,”12”,”ABC”,”c1a”) Output:6 (2+1+2+1) Note in the above array 12
    // must not considered as such it must be considered as 1,2

    public static void main(String[] args) {
        char[] numbers = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        int sum = 0;
        for (String value : args) {
            System.out.println("VALUE: " + value);
            for (int i = 0; i < value.length(); i++) {
                for (int j = 0; j < numbers.length; j++) {
                    if (numbers[j] == value.charAt(i)) {
                        sum = sum + Integer.parseInt(String.valueOf(value.charAt(i)));
                    }
                }
            }
        }
        System.out.println("The Sum of the Numbers from the given string is: " + sum);

    }

}
