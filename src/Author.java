import java.util.Scanner;
public class Author {
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    };
    public String getGender() {
        String g;
        if(gender=='m')
            g = "male";
        else g = "female";
        return g;
    }
    public String getEmail() {
        return email;
    }
    public String setEmail() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter new email: ");
        String text = keyboard.nextLine();
        String temp = email;
        email = text;
        return "Old email> " + temp +
                "\n";

    }
    public String toString() {
        String g;
        if(gender=='m')
            g = "male";
        else g = "female";

        return "Author: " + "\n" +
                name + "\n" +
                g + "\n" +
                email + "\n";
    }
}
