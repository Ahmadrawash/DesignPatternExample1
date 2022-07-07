import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        System.out.println("get singleton book object");
        System.out.println(BookSingleton.getBook());

        System.out.println("get factory book object");
        int numberOfObj = 3;
        System.out.println("enter a number between 1 and 10");
        Scanner sc  = new Scanner(System.in);
        numberOfObj = sc.nextInt();
        for(int i = 0 ; i < numberOfObj; i++)
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
