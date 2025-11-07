package lab6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InputReader reader = new InputReader("1 5.4 fg 34 5 6 1 34d");
        System.out.println("Input: " + Arrays.toString(reader.getArray().getInput()));
        System.out.println("Input number: " + reader.getArray().getInputNumber());
        System.out.println("Indices of numbers that sum up to 10 are: "
                + Arrays.toString(SumTwo.findIndicesOfElementsSummingUpToATarget(reader.getArray(), 10)));
    }
}
