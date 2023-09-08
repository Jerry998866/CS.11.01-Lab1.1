import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age:");
        int UserAge=scanner.nextInt();
        int DateAge=7+(UserAge/2);
        System.out.println(UserAge+"-years olds should be dating someone who is at least "+DateAge+"-years old");
    }
}
