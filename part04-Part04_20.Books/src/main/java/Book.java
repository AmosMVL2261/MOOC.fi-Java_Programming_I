public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String title, int pages, int year){
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public int getYear(){
        return this.year;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.year;
    }
}
