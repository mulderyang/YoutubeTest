package com.example.jeny.youtubetest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class MainActivity extends YouTubeBaseActivity {

    Button b;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.view);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                //youTubePlayer.loadVideo("SVlA0wF52w0");
                youTubePlayer.cueVideo("SVlA0wF52w0");
                //youTubePlayer.cuePlaylist("PLhBgTdAWkxeB-zCekGukAo0DzmpwBiua2");
               // youTubePlayer.loadPlaylist("PLhBgTdAWkxeB-zCekGukAo0DzmpwBiua2");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        //youTubePlayerView.initialize("AIzaSyBA86a0irXid2KukMYn8tEyJkTD6eDomHs", onInitializedListener);


        b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                youTubePlayerView.initialize("AIzaSyBA86a0irXid2KukMYn8tEyJkTD6eDomHs", onInitializedListener);
            }
        });


    }
}
