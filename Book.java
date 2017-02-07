
/**
 * With this class you can instantiate an object of book.
 * Java Assignment 3
 * @author: Mackenzie Bloswick
 * @version: 2.7.2016
 */

public class Book
{
    private int isbnNum, numPages;
    private String lastName, firstName, bookTitle, datePublished;

    public Book(String authorLastName, String authorFirstName, int isbnNumber, String booksTitle, String publicationDate, int numberPages)
    {
        lastName = authorLastName;
        firstName = authorFirstName;
        isbnNum = isbnNumber;
        bookTitle = booksTitle;
        numPages = numberPages;
        datePublished = publicationDate;
    }
 
    public String getAuthorLastName()
    {
        return lastName;
    }
    
    public String getAuthorFirstName()
    {
        return firstName;
    }
    
    public int getIsbnNumber()
    {
        return isbnNum;
    }
    
    public String getBookTitle()
    {
        return bookTitle;
    }
    
    public String getDatePublished()
    {
        return datePublished;
    }
    
    public int getNumberOfPages()
    {
        return numPages;
    }
    
}