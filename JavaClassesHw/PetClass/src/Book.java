
public class Book {

    private int pages;
    private String title;
    private boolean fiction;

    // Constructor
    public Book() {
        System.out.println("This is the empty Constructor");

    }

    public Book(String title, boolean fiction) {
        this.title = title;
        this.fiction = fiction;
    }

    public Book(int pages, String title, boolean fiction) {
        this.pages = pages;
        this.title = title;
        this.fiction = fiction;
    }

    // Get Methods
    public void getTitle(){
        System.out.printf("\nThe book is titled %s", title);
    }
    public void getPageNum(){
        System.out.printf("\nThe book has %d pages", pages);
    }
    public void getFiction(){
        System.out.printf("\nThe book is fiction: %s", fiction);
    }

    //Set Methods
    public void setTitle(String capitalizedTitle){
        System.out.printf("\nThe Official title is %s", capitalizedTitle);
       
    }

    public void setPages(int untornPages){
        System.out.println("\nToal number of good pages: " + pages);
        this.pages = (-untornPages) + pages;
    }

    public void setFiction(boolean goodFiction){
        System.out.printf("\nThe book is fiction: %s ", fiction, "\nThe book is good: %s", goodFiction);
    }

    public boolean getFictionTorF(){
        return this.fiction;
    }
    
    public String getBookName(){
        return this.title;
    }

}
