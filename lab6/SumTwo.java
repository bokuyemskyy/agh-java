package lab6;

public class SumTwo {
    public static int[] findIndicesOfElementsSummingUpToATarget(NumbersArray array, int target) {
        int[] result = new int[] { -1, -1 };

        for (int first = 0; first < array.getInputNumber(); first++) {
            for (int second = first + 1; second < array.getInputNumber(); second++) {
                if (array.getElement(first) + array.getElement(second) == target) {
                    result[0] = first;
                    result[1] = second;

                    return result;
                }
            }
        }

        return result;
    }
}
