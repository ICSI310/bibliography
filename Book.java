public class Book extends Citation {
  // class variables
  private String publisher;
  
  // constructors
  public Book() {
    super();
    this.publisher = "";
  }
  
  public Book(String publisher, String author, String title, Date date) {
    super(author, title, date);
    this.publisher = publisher;
  }
    
  // methods
  // getters
  public String getPublisher() {
    return this.publisher;
  }
  
  // setters
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  
  @Override
  public String toString() {
    return (super.toString() + " " +
            this.publisher);
  }
  
  @Override
  public void print() {
    System.out.println(this.toString());
  }
  
  
  
}