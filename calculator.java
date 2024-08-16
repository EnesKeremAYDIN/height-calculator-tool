import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your height (cm): ");
        int height = scanner.nextInt();
        System.out.println("Your height is " + height + " cm");
    }
}
