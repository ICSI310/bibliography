public class Citation {
  // class variables
  private String author;
  private String title;
  private Date date;
  
  // constructors
  public Citation() {
    this.author = "";
    this.title = "";
    this.date = new Date();
  }
  
  public Citation(String author, String title, Date date) {
    this.author = author;
    this.title = title;
    this.date = date;
  }
    
  // methods
  // getters
  public String getAuthor() {
    return this.author;
  }
  
  public String getTitle() {
    return this.title;
  }
  
  public Date getDate() {
    return this.date;
  }
  
  // setters
  public void setAuthor(String author) {
    this.author = author;
  }
  
  public void setTitle(String title) {
    this.title = title;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public String toString() {
    return (this.title + " " +
            this.author + " " + 
            this.date );
  }
  
  public void print() {
    System.out.println(this.toString());
  }
  
  
  
}