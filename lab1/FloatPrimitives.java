import java.math.BigDecimal;

public class FloatPrimitives {
    private static float firstFloat = 3.44f;
    static double sumResult = (int)firstFloat + 23;

    static BigDecimal first = new BigDecimal("0.1");
    static BigDecimal second = new BigDecimal("0.2");
    
    public static void printFloat() {
        System.out.println("Inside print float...");
        System.out.println("firstFloat: " + firstFloat);
        System.out.println("formatted firstFloat: " + String.format("%.2f", firstFloat));
        System.out.println("sumResult: "+String.format("%1.10f", sumResult));
        System.out.println(1.4-0.33);
        System.out.println(0.1+0.2);
        System.out.println("BigDecimal add: "+String.format("%.18f", first.add(second)));
    }

}