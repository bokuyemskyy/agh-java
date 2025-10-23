import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Book book1 = new Book("Happy Thoughts", true, LocalDate.of(2025, 9, 9));
        System.out.println(book1.toString());
        int borrowDays = UtilityBook.getBorrowedDays(book1);
        if (borrowDays >= 0) {
            System.out.println("The book is borrowed for: " + borrowDays + " days");
            System.out.println("Penalty fee is: " + UtilityBook.getFee(book1) + " zl");
        }
        else {
            System.out.println("As the book was not borrowed at all, it is borrowed for 0 days now and the fee is 0.0 zl");
        }
    }
}