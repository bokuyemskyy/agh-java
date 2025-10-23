public class IntegerPrimitives {
    private static int id = 1000;
    private static byte rank = 11;
    private static int telephone = 733_444_733;
    private static int shift = 9;
    private static long second = 777_999_5253l;
    private static int hexRepr = 0x045;
    public static void printInt() {
        System.out.println("Printing the integers in a method...");
        System.out.println("id: " + id);
        System.out.println("rank: " + rank);
        System.out.println("telephone: " + telephone);
        System.out.println("shift: " + shift);
        System.out.println("operation: " + (telephone + shift));
        System.out.println("operation (str): " + telephone + shift);
        System.out.println("second: " + second);
        System.out.println("hexRepr: " + hexRepr);
    }
    public static void printRanges() {
        System.out.println("Inside print ranges...");
        System.out.println("Byte minimal: " + Byte.MIN_VALUE);
        System.out.println("Byte maximal: " + Byte.MAX_VALUE);
        System.out.println("Short minimal: " + Short.MIN_VALUE);
        System.out.println("Short maximal: " + Short.MAX_VALUE);
        System.out.println("Integer minimal: " + Integer.MIN_VALUE);
        System.out.println("Integer maximal: " + Integer.MAX_VALUE);
        System.out.println("Long minimal: " + Long.MIN_VALUE);
        System.out.println("Long maximal: " + Long.MAX_VALUE);
    }
}