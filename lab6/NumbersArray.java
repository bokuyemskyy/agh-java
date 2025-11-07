package lab6;

public class NumbersArray {
    private int[] input;
    private int inputNumber;

    public NumbersArray(int[] input, int inputNumber) {
        this.input = input;
        this.inputNumber = inputNumber;
    }

    public int getElement(int index) {
        return input[index];
    }

    public int getInputNumber() {
        return inputNumber;
    }

    public int[] getInput() {
        return input;
    }
}
