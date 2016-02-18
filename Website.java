public class Website extends Citation {
  // class variables
  private String siteName;
  private String url;
  private Date accessDate;
  
  // constructors
  public Website() {
    super();
    this.siteName = "";
    this.url = "";
    this.accessDate = new Date();
  }
  
  public Website(String author, String title, Date date, String sitename, String url, Date accessDate) {
    super(author, title, date);
    this.siteName = siteName;
    this.url = url;
    this.accessDate = accessDate;
  }
    
  // methods
  // getters
  public String getSiteName() {
    return this.siteName;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public String getAccessDate() {
    return this.accessDate;
  }
  
  // setters
  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }
  
  public void setUrl(String url) {
    this.url = url;
  }
  
  public void setAccessDate(String accessDate) {
    this.accessDate = accessDate;
  }
  
  @Override
  public String toString() {
    return (super.toString() + " " +
            this.siteName + " " + 
            this.url + " " + 
            this.accessDate + " " + );
  }
  
  @Override
  public void print() {
    System.out.println(this.toString());
  }
  
  
  
}