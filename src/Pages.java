import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int UserAge = scanner.nextInt();
        int readPage = 100-UserAge;
        System.out.println(UserAge+"-years olds should read at least "+readPage+" pages before giving up on a book");

    }
}
