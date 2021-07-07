package quotes;

import java.util.*;

public class Quote {
    private String [] tags;
    private String author;
    private String LIKES;
    private String text;
    private List<Quote> results;

    public Quote(String[] tags, String author, String LIKES, String text) {
        this.tags = tags;
        this.author = author;
        this.LIKES = LIKES;
        this.text = text;
    }

    public String[] getTags() {
        return tags;
    }

    public String getAuthor() {
        return author;
    }

    public String getLIKES() {
        return LIKES;
    }

    public String getText() {
        return text;
    }

    public List<Quote> getResults() {
        return results;
    }

    @Override
    public String toString() {

        return  "{ Quote: " + text + ", " + "Author: " + author + " }";
    }
}
