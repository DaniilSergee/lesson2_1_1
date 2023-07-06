public class Content {
    private String genre;
    private int length;
    private int width;
    private int height;
    public Content(String genre, int length, int width, int height) {
        this.genre=genre;
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public String getGenre() {
        return genre;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
