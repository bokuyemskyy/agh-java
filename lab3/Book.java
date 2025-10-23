import java.time.LocalDate;

public class Book {
    private String name = null;
    private boolean isBorrowed = false;
    private LocalDate borrowDate = null;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, boolean isBorrowed) {
        this.name = name;
        this.isBorrowed = isBorrowed;
    }

    public Book(String name, boolean isBorrowed, LocalDate borrowDate) {
        this.name = name;
        this.isBorrowed = isBorrowed;
        this.borrowDate = borrowDate;
    }

    public Book(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setNamesetName(String name) { this.name = name; }
    public void setNamesetsBorrowed(boolean isBorrowed) { this.isBorrowed = isBorrowed; }
    public void setNamesetBorrowDate(LocalDate borrowDate) { this.borrowDate = borrowDate; }

    public String getName() { return this.name; }
    public boolean getIsBorrowed() { return this.isBorrowed; }
    public LocalDate getBorrowDate() { return this.borrowDate; }
    
    public String toString() { 
        if (isBorrowed) {    
            return "Book \"" + name + "\" is borrowed at " + borrowDate;
        }
        else {
            return "Book " + name + " is not borrowed";
        }
    }
}