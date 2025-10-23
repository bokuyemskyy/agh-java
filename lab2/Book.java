import java.util.Arrays;
import java.util.Objects;

public class Book {
    public byte[] number = new byte[10];
    public String title;

    Book(String title, byte[] number) {
        this.title = title;
        for (int i = 0; (i < number.length && i < this.number.length); i++) {
            this.number[i] = number[i];
        }
        this.number = number;
    }
    public boolean sameTitle(Book book) {
        if (book == null) return false;
        for (int i = 0; i < this.title.length(); i++) {
            if (this.title.charAt(i) != book.title.charAt(i)) return false;
        }
        return true;
    }
}
