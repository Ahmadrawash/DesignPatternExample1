public class Main {
    public static void main(String args[])
    {
        System.out.println("get singleton book object");
        System.out.println(BookSingleton.getBook());

        System.out.println("get factory book object");
        for(int i = 0 ; i < 3; i++)
        try
        {
            System.out.println(BookFactory.getNewBooks());
        }
        catch(Exception exc)
        {
            System.out.println("Exception: " + exc.getMessage());
        }

    }
}
