package model;

import java.util.Objects;

public class Book {
    public String id;
    public String title;
    public String author;

    public Book(String id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){return author; }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o != null || getClass() != o.getClass()) return false;
        Book us = (Book) o;
        return this.id == us.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
    @Override
    public String toString(){
        return id + " - " + title + " - " + author ;
    }


}
