package main.java.com.training.qn02;

public class FindVowels {

    // Find the number of vowels in a given string
    // Input1:”NewyorkE” 'e' or 'E' - it should be counted as 1 Output1:2
    // Hint:irrespective of case
    public static void main(String[] args) {

        int[] count = new int[5];

        for (String value : args) {
            System.out.println("The Value: " + value);
            for (int i = 0; i < value.length(); i++) {
                char ch = value.toLowerCase().charAt(i);

                switch (ch) {
                case 'a':
                    ++count[0];
                    break;
                case 'e':
                    ++count[1];
                    break;
                case 'i':
                    ++count[2];
                    break;
                case 'o':
                    ++count[3];
                    break;
                case 'u':
                    ++count[4];
                    break;
                default:
                }
            }
        }
       
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                count[i] = 1;
            }
           
            sum = sum + count[i];
        }
        System.out.println("Count of vowel is: " + sum);
    }
}
