//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the price of the Item: ");
    double price = scanner.nextDouble();
    double Shipping = price * .02;
    double Total = price + Shipping;
    if (price <= 100) {}
        System.out.println("Your total with shipping is $" + Total);

    if (price > 100) {}
        System.out.println("Your total with free shipping is $" + price);

    }

}
