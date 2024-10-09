public class UseBookStoreWindow {
    public static void main(String[] args) {
        BookStoreWindow store = new BookStoreWindow("Byte's Books");
        store.addNewBook(new Book("A-001", "Smelly", 1850, 3.99));
        store.addNewBook(new Book("B-002", "Sword", 2003, 5.99));
        store.addNewBook(new Book("C-003", "Man", 2023, 7.99));

        System.out.println(store.averageBookPrice());
    }
}
