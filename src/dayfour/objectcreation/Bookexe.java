package dayfour.objectcreation;

public class Bookexe {
    public static void main(String[] args) {
        Book book = new Book();
        Book book2 = new Book("Cyber", "Kaitse",2000);
        System.out.println("Book Details: ");
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Published Year: " + book.publishedYear);
        System.out.println();
        System.out.println(" book2: " + " \n " + "Title: " +  book2.title + " \n " + "Author: " + book2.author + " \n " + "Published Year: " + book2.publishedYear);
    }
}
