package org.example.pltw.medialib;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MediaLibActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_lib);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);
    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {

        TextView outputText = (TextView) findViewById(R.id.mediaLibText);

        Song song1 = new Song("The Twist", 1.29, 3);
        Song song2 = new Song("Smooth", .99, 5);
        Movie movie1 = new Movie("Almost Famous");
        Movie movie2 = new Movie("The Matrix");
        Book book1 = new Book("Count of Monte Cristo");
        Book book2 = new Book("ReadY Player One");

        outputText.append("SONGS:\n");
        outputText.append(song1.getTitle() + "\n");
        outputText.append(song2.getTitle() + "\n");
        outputText.append("\n");

        outputText.append("MOVIES:\n");
        outputText.append(movie1.getTitle() + "\n");
        outputText.append(movie2.getTitle() + "\n");
        outputText.append("\n");

        outputText.append("BOOKS:\n");
        outputText.append(book1.getTitle() + "\n");
        outputText.append(book2.getTitle() + "\n");
    }
}