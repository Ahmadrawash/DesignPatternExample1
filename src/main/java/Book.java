public class Book {
    String title;
    String Type;

    public Book(String title, String type) {
        this.title = title;
        Type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", Type='" + Type + '\'' +
                '}';
    }
}
