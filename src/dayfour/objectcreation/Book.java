package dayfour.objectcreation;
        //TODO Exercise 1: Create a Book class
        //Create a class named Book with the following properties:
        //title (String)
        //author (String)
        //yearPublished (int)
        //The class should have:
        //A default constructor that sets the properties to default values:
        //title = "Unknown"
        //author = "Unknown"
        //yearPublished = 1900
        //A parameterized constructor that initializes the properties with
        // values passed in.
        //Write a main method to create objects using both constructors and
        // print out the properties.
public class Book {
    String title;
    String author;
    int publishedYear;

    public Book() {
        title = "Unknown Title";
        author = "Unknown";
        publishedYear = 1900;
    }
    public Book(String title, String author, int publishedYear) {
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }
}
