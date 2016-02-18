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
    Citation citation = new Citation();
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
    myCitation.print();
  }
  
} // class Main
