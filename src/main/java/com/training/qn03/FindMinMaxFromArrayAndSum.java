package main.java.com.training.qn03;

public class FindMinMaxFromArrayAndSum {

    // Find the sum of maximum and minimum number from a given input array Input:{19,17,12} 
    // max - 19 min - 12 sum - 31 Output:31
    public static void main(String[] args) {
        
        System.out.println("Input Array: " + args);
        
        int max = Integer.parseInt(args[0]);
        int min = Integer.parseInt(args[0]);
        
        for (int i=0; i< args.length; i++) {
            if (Integer.parseInt(args[i])>max) {
                max = Integer.parseInt(args[i]);
            } else {
                min = Integer.parseInt(args[i]);
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("SUM: " + (min+max));
        
    }
}
