package com.cjb.greeting.rest.model;

public class Greeting {

    private String id;
    private String author;
    private String message;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format(
                "Greeting[id=%s, author='%s', message='%s']",
                id, author, message);
    }


}
