package org.example.pltw.medialib;

public class Song {
    // instance variables
    private int rating;
    private String title;
    private double price;
    private boolean favorite;

    /**
     * Constructor for objects of class Song
     */
    public Song() {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
    }

    public Song(String title) {
        // initialise instance variables
        rating = 0;
        this.title = title;
        price = 0.0;
        favorite = false;
    }

    public Song(String title, double price) {
        this.title = title;
        this.price = price;
        this.rating = 0;
        this.favorite = false;
    }

    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.favorite = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int r) {
        rating = r;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public void addToFavorites() {
        favorite = true;
    }
}
