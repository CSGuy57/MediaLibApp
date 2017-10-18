package org.example.pltw.medialib;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MediaLibActivity extends ListActivity {
    private Song[] songs = {
            new Song("The Twist", .99, 1),
            new Song("Smooth", .99, 2),
            new Song("Mack The Knife", .99, 3),
            new Song("How Do I Live", .99, 4),
            new Song("Party Rock Anthem", .99, 5),
            new Song("I Gotta Feeling", .99, 6),
            new Song("Macarena", .99, 7),
            new Song("Physical", .99, 8),
            new Song("You Light Up My Lift", .99, 9),
            new Song("Hey Jude", .99, 10)
    };

    private ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_lib);

        for (Song s : songs) {
            MediaFile.writeString(s.getTitle() + "|" + s.getRating());
        }

        MediaFile.saveAndClose();

        ArrayList<Song> songsArrayList = new ArrayList<>();

        String songInfo = MediaFile.readString();
        while (songInfo != null) {
            Song s = new Song();
            int indexOfPipe = songInfo.indexOf("|");

            s.setTitle(songInfo.substring(0, indexOfPipe));
            s.setRating(
                    Integer.parseInt(
                            songInfo.substring(indexOfPipe + 1, songInfo.length())));

            songsArrayList.add(s);

            songInfo = MediaFile.readString();
        }

        MediaFile.saveAndClose();

        SongListAdapter adapter = new SongListAdapter(this, songsArrayList);
        setListAdapter(adapter);
    }
}