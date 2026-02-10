public class Library {

    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count>=books.length){
            System.out.println("Нет места");
            return;
        }
        books[count++]=book;
    }

    // TODO: Display all books
    public void displayBooks() {
        if (count<=0){
            System.out.println("Пусто");
            return;
        }
        for (int i = 0;i<count;i++){
            System.out.println(books[i]);
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (int i = 0;i<count;i++){
            if(books[i].getTitle().equalsIgnoreCase(title)){
                return books[i];
            }
        }
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book book=searchByTitle(title);
        if (book==null){
            System.out.println("Книги нет");
        }
        else if (!book.isAvailable()){
            System.out.println("Книга занята");
        }
        else {book.borrowBook();
            System.out.println("Взята");}
    }


    // TODO: Return book by title
    public void returnBook(String title) {
        Book book=searchByTitle(title);
        if (book==null){
            System.out.println("Книги нет");
        }
        else if (book.isAvailable()){
            System.out.println("Книга не занята");
        }
        else {book.returnBook();
            System.out.println("Вернута");}
    }
}
