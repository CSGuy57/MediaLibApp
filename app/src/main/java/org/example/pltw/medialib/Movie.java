package org.example.pltw.medialib;

public class Movie
{
    // instance variables
    private int rating;
    private String title;
    private int duration;

    /**
     * Constructor for objects of class Song
     */
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        duration = 0;
    }

    public Movie(String title){
        this.rating = 0;
        this.title = "";
        this.duration = 0;
    }

    public String formatDuration(int d) {
        int minutes = d % 60;
        int hours = (d - minutes) / 60;
        return hours + " hours and " + minutes + " minutes";
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

    public void setDuration(int d) {
        duration = d;
    }

    public int getDuration(){
        return duration;
    }
}