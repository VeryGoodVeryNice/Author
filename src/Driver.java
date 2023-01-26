import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Author[] AuthArray1 = new Author[3];
        AuthArray1[0] = new Author("Johntavious", "MRBEAST@mr.beast", 'm');
        AuthArray1[1] = new Author("Tanisha", "uhhhh@ahhh.eh", 'f');
        AuthArray1[2] = new Author("Quandale", "hehe@he.ha", 'm');

        Book book1 = new Book("Lord of the flies", AuthArray1, 15.45, 4098);

        //System.out.println(AuthArray1[0].setEmail());
        //System.out.println(AuthArray1[2]);
        ////
       // System.out.println(" ");
        ////
       // System.out.println(book1);
      //  System.out.println(book1.getAuthor(2).getEmail());

        System.out.println(book1.getAuthorsNames());
    }
}

