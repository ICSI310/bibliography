// declare the class.
public class Main 
{
  
  // the main (and only) method
  public static void main(String[] args) {
    //Date date = new Date(16, 2, 2016);
    
    Date date = new Date();
    
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
    
    System.out.println(date.toString());
    

  }
} // class Main
