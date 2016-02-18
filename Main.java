// declare the class.
public class Main 
{
  
  // the main (and only) method
  public static void main(String[] args) {
    //Date date = new Date(16, 2, 2016);
    
    /*Date date = new Date();
    
    // test constructor, getters
    System.out.println("day: " + date.getDay());
    System.out.println("month: " + date.getMonth());
    System.out.println("year: " + date.getYear());
    
    // test setters
    date.setDay(1);
    date.setMonth(2);
    date.setYear(3456);
    
    System.out.println("day: " + date.getDay());
    System.out.println("month: " + date.getMonth());
    System.out.println("year: " + date.getYear());
    
    System.out.println(date.toString());*/
    
    // test initial constructor
    /*Citation citation = new Citation();
    System.out.println("author: " + citation.getAuthor());
    System.out.println("title: " + citation.getTitle());
    System.out.println("date: " + citation.getDate());

    // test other constructor
    Citation myCitation = new Citation("Upton Sinclair", "The Jungle", new Date(16, 2, 2016));
    System.out.println("author: " + myCitation.getAuthor());
    System.out.println("title: " + myCitation.getTitle());
    System.out.println("date: " + myCitation.getDate());
    
    // test setters
    myCitation.setAuthor("Author");
    myCitation.setTitle("Title");
    myCitation.setDate(new Date());
    System.out.println("author: " + myCitation.getAuthor());
    System.out.println("title: " + myCitation.getTitle());
    System.out.println("date: " + myCitation.getDate());
    
    System.out.println("to test myCitation.print()");
    myCitation.print();*/
    
    // test Book Class
    Book book1 = new Book();
    // test default constructor
    book1.print();
    
    // test setters
    book1.setDate(new Date(10, 11, 12));
    book1.setTitle("Strawberry Cake Recipe");
    book1.setAuthor("Daryl Strawberry");
    book1.setPublisher("Banannas");
    // test print
    book1.print();
    
    // test toString
    System.out.println(book1.toString());
    
    // test getters
    System.out.println("publisher: " + book1.getPublisher());
    System.out.println("author: " + book1.getAuthor());
    System.out.println("title: " + book1.getTitle());
    System.out.println("date: " + book1.getDate());
    
    // test constructor with arguments
    Book book2 = new Book("publisher", "author", "title", new Date(7,8,9));
    book2.print();
    
    // test constructor from superclass
    // superclass constructor won't interfere with subclasses if not implented
    // but don't try casting -> classCastException
    /*Citation book3 = new Citation("the author", "the title", new Date(2, 17, 2016));
    Book book4 = (Book)book3;
    book4.print();*/
    
    //test Website object
    // test default constructor
    Website site1 = new Website();
    // test print method
    site1.print();
    
    // test constructor that takes values
    Website site2 = new Website("author", "title", new Date(2, 17, 2016), "sitename", "url", new Date(3, 20, 2017));
    site2.print();
    
    // test setters
    site2.setAuthor("me");
    site2.setTitle("my website");
    site2.setDate(new Date(1, 2, 3));
    site2.setSiteName("sitename");
    site2.setUrl("thing.com");
    site2.setAccessDate(new Date(4, 5, 6));
    // test getters
    System.out.println("author: " + site2.getAuthor());
    System.out.println("title: " + site2.getTitle());
    System.out.println("date: " + site2.getDate());
    System.out.println("siteName: " + site2.getSiteName());
    System.out.println("url: " + site2.getUrl());
    System.out.println("accessDate: " + site2.getAccessDate());

    
    
    
    
    
    
    
  }
  
} // class Main
