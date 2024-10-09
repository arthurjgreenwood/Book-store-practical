import java.util.ArrayList;

public class BookStoreWindow {
    
    //fields
    private ArrayList<Book> windowCollection = new ArrayList<>();
    private String storeName;
    
    //Constructor
    
    public BookStoreWindow(String storeName) {
        this.storeName = storeName;
    }
    
    //sGetters
    
    public ArrayList<Book> getWindowCollection() {
        return windowCollection;
    }
    
    public String getStoreName() {
        return storeName;
    }
    
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public Book getBookByIndex(int index) {
        return windowCollection.get(index);
    }
    
    
    // methods
    
    public void addNewBook(Book newBook) {
        if (!windowCollection.contains(newBook))
            windowCollection.add(newBook);
        else
            System.out.println("Book is already in the window");
    }
    
    public void removeBook(Book book) {
        if (windowCollection.contains(book))
            windowCollection.remove(book);
        else
            System.out.println("Book is not in the window");
    }
    
    public String mostValuableBook() {
        Book mostValuableBook = this.windowCollection.get(0);
        for (Book currentBook : this.windowCollection){
            if (currentBook.getPrice() > mostValuableBook.getPrice())
                mostValuableBook = currentBook;
        }
        return mostValuableBook.getTitle();
    }
    
    public String oldestBook(){
        Book oldestBook = this.windowCollection.get(0);
        for (Book currentBook : this.windowCollection){
            if (currentBook.getYearPublished() < oldestBook.getYearPublished())
                oldestBook = currentBook;
        }
        return oldestBook.getTitle();
    }
    
    public String averageBookPrice(){
        double totalPrice = 0;
        for (Book currentBook : this.windowCollection){
            totalPrice += currentBook.getPrice();
        }
        double averagePrice =  totalPrice / this.windowCollection.size();
        return String.format("$%.2f", averagePrice);
    }
}


