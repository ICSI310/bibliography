public class Date {
  // class variables
  private int day;
  private int month;
  private int year;
  
  // constructors
  public Date() {
    this.day = 0;
    this.month = 0;
    this.year = 0;
  }
  
  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
    
  // methods
  // getters
  public int getDay() {
    return this.day;
  }
  
  public int getMonth() {
    return this.month;
  }
  
  public int getYear() {
    return this.year;
  }
  
  // setters
  public void setDay(int day) {
    this.day = day;
  }
  
  public void setMonth(int month) {
    this.month = month;
  }
  
  public void setYear(int year) {
    this.year = year;
  }
  
  public String toString() {
    return (String.format("%02d", this.month) + 
            "/" + 
            String.format("%02d", this.day) +
            "/" + 
            String.format("%04d", this.year));

  }
  
}