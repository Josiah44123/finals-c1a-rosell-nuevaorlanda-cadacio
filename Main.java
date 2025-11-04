import java.util.Scanner;
public class Main {
public static void main(String[] args) {
    System.out.println("Hello, World!");
    System.out.println("Pick a number between 1 and 3:");
    int number = new Scanner(System.in).nextInt();

    switch ( number ) {
        case 1:
            
            break;
        case 2:
            
            break;
        case 3:
            
            break;
        default:
            throw new AssertionError();
    }

    }
}