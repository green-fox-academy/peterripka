import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet user instead of the World!
        // The program should ask for the name of the user
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your username!");

        String username=input.next();
        System.out.println("Hello " + username + "!");
            }
        }