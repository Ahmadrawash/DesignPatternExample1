public class BookFactory {
    static private int count = 0;
    static final int maxSize = 100;
    private static Book[] mybooks = new Book[maxSize];

    static Book getNewBooks() throws Exception
    {
        if (count == 0) //no book objects has been created
        {
            mybooks[count++] = new Book("title 1", "topic 1");
        }
        else if (count > maxSize) //exception count has exceeded maxSize
        {
            throw new Exception("count has exceeded maxSize");
            //return null;
        }
        else //count > 0 and count < maxSize
         mybooks[count++] = new Book("title: " + count , ", topic: " + count);

        return mybooks[count-1];
    }
}
