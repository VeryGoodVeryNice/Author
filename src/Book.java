import java.util.Scanner;

public class Book {
    String name;
    Author author;
    double price;
    int quantity;

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author.toString();
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public String setPrice() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new price: ");
        double text = keyboard.nextDouble();
        double temp = price;
        price = text;
        return "Old price> " + temp + "$" +
                "\n";
    }
    public String setQuantity() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new quantity: ");
        int text = keyboard.nextInt();
        int temp = quantity;
        quantity = text;
        return "Old quantity> " + temp + " copies" +
                "\n";
    }
    public String toString() {
        return "Book: " + "\n" +
                name + "\n" +
                price + "$" + "\n" +
                quantity + " copies left" + "\n" +
                author.toString() + "\n" +
                "\n";
    }
}
