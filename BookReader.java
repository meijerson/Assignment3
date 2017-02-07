
/**
 * This BookReader class prints the state of a Book Object.
 * 
 * @author: Mackenzie Bloswick
 * @version: 2.7.2017
 */

public class BookReader
{
    public void printAllBookInfo(Book book)
    {
        printBookTitle(book);
        printAuthorLastName(book);
        printAuthorFirstName(book);
        printIsbnNumber(book);
        printDatePublished(book);
        printNumberOfPages(book);
    }
    
    public void printAuthorLastName(Book book)
    {
        String lastName = book.getAuthorLastName();
        System.out.println("Author's Last Name: " + lastName);
    }
    
    public void printAuthorFirstName(Book book)
    {
        String firstName = book.getAuthorFirstName();
        System.out.println("Author's First Name: " + firstName);
    }
    
    public void printIsbnNumber(Book book)
    {
         int isbnNum = book.getIsbnNumber();
        System.out.println("ISBN Number: " + isbnNum);
    }
    
    public void printBookTitle(Book book)
    {
        String bookTitle = book.getBookTitle();
        System.out.println("Book Title: " + bookTitle);
    }
    
    public void printDatePublished(Book book)
    {
        String datePublished = book.getDatePublished();
        System.out.println("Date Published: " + datePublished);
    }
    
    public void printNumberOfPages(Book book)
    {
        int numPages = book.getNumberOfPages();
        if (numPages < 10) {
            System.out.println("ERROR: The number of pages (" + numPages + ") is below 10.");
        }
        else {
            System.out.println("Number of Pages: " + numPages);
        }
    }
}

