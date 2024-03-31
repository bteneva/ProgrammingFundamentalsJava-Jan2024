package ObjectAndClasses.Lab.Articles;

public class Articles {
    private String title;
    private String content;
    private String author;

    //constructor
    public Articles(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
    //methods
    public String getAuthor(String author) {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }
    public void Edit(String newContent){
        this.content = newContent;
    }
    public void ChangeAuthor(String newAuthor){
        this.author = newAuthor;
    }
    public void Rename (String newTitle){
        this.title = newTitle;
    }

    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
