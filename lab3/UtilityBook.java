import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class UtilityBook {
    static private final int DAYS = 30;
    static private final float FEE = 0.5f;

    public static int getBorrowedDays(Book book) {
        if (!book.getIsBorrowed()) return -1;
        if (book.getBorrowDate() == null) throw new java.lang.Error("Book is invalid");
        return (int)ChronoUnit.DAYS.between(book.getBorrowDate(), LocalDate.now());
    }

    private static boolean isOverkept(Book book) {
        return getBorrowedDays(book) > DAYS;
    }

    public static double getFee(Book book) {
        if (!isOverkept(book)) return 0;
        return (getBorrowedDays(book) - DAYS) * FEE;
    }   
}
