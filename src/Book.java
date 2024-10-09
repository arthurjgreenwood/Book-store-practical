public class Book{
    
    //Fields
    
    private String bookID;
    private String title;
    private int yearPublished;
    private double price;
    
    //Constructor(s)
    
    public Book(String bookID, String title, int yearPublished, double price){
        this.bookID = bookID;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    
    //Mutators
    
    public String getBookID(){
        return bookID;
    }
    public String getTitle(){
        return title;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public double getPrice(){
        return price;
    }
    public void setBookID(String bookID){
        this.bookID = bookID;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String toString() {
        return String.format(
                        "BookID:            %s\n" +
                        "Title:             %s\n" +
                        "Year Published:    %d\n" +
                        "Price:             %.2f\n",
                        this.getBookID(), this.getTitle(), this.getYearPublished(), this.getPrice());
    }
}