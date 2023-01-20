public class Driver {
    public static void main(String[] args) {
        Author auth1 = new Author("Jimmy", "balls@balls.com", 'm');
        Book book1 = new Book("Lord of the flies", auth1,15.45,4098);

        System.out.println(auth1.getGender());
        System.out.println(auth1.setEmail());
        System.out.println(auth1);
        ////
        System.out.println(" ");
        ////
        System.out.println(book1.setPrice());
        System.out.println(book1.setQuantity());
        System.out.println(book1);
    }
}
