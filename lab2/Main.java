import java.util.Arrays;

public class Main {
    static float rent = 26.5f;
    static int salary = 40;

    public static void main(String[] args) {

        System.out.println("===== Rent =====");
        boolean wasAffordable = true;
        for (int i = 1; i <= 10 && wasAffordable; i++) {
            wasAffordable = IsAffordable();
            IncreasePay();
        }

        System.out.println("===== Seasons =====");
        System.out.println(SeasonName(1));
        System.out.println(SeasonName(12));
        System.out.println(SeasonName(7));

        System.out.println("===== Books =====");
        Book book = new Book("Hello", new byte[]{64, 34, 5});
        System.out.println(book.title);
        System.out.println(Arrays.toString(book.number));

        Book book1 = new Book("Hello", new byte[]{33, 33, 54});
        System.out.println(book.sameTitle(book1));
    }

    private static boolean IsAffordable() {
        if ((salary > rent) && (rent++ < 30)) {
            System.out.println("Rent " + rent + " is affordable");
            return true;
        } else {
            System.out.println("Rent " + rent + " is not affordable");
            return false;
        }
    }

    private static void IncreasePay(float amount) {
        rent += amount;
    }

    private static void IncreasePay() {
        rent++;
    }

    private static String SeasonName(int monthNumber) {
        return switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "No such month!!";
        };
    }
}
