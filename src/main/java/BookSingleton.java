public class BookSingleton {
    private static Book myBook;

    static Book getBook()
    {
        if (myBook == null)
            myBook = new Book("programming", "Computer Science");
        return myBook;
    }
}
