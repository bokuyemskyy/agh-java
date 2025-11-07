package lab6;

public class InputReader {
    NumbersArray array;

    public InputReader(String input) {
        readInput(input);
    }

    private boolean isNumeric(String string) {
        if (string == null || string.isEmpty())
            return false;
        return string.matches("-?\\d+");
    }

    public NumbersArray readInput(String input) {
        if (input == null || input.isEmpty())
            return null;

        String[] inputStrings = input.split("\\s+");
        int[] inputArray = new int[inputStrings.length];
        int index = 0;

        for (String inputString : inputStrings) {
            if (isNumeric(inputString)) {
                inputArray[index] = Integer.parseInt(inputString);
                index++;
            }
        }

        array = new NumbersArray(inputArray, index);
        return array;
    }

    public NumbersArray getArray() {
        return array;
    }
}
