package com.example.videos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class menu3 extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener , YouTubePlayer.PlaybackEventListener{

    YouTubePlayerView youTubePlayerView;
    String clave="AIzaSyCq5yiHv8_D7J7A_TYsPvsOrBYdCJ-ilyQ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youTubePlayerView =(YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubePlayerView.initialize(clave,this);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean restaurado) {

        if(!restaurado){
            youTubePlayer.cueVideo("h3VsXvYNrSk");
        }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        if(youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(this,1).show();
        }else{
            String error= "Error al iniciar youtube"+youTubeInitializationResult.toString();

            Toast.makeText(getApplication(),error ,Toast.LENGTH_SHORT).show();
        }

    }
    protected  void onActivityResult (int requestCode,int resultCode, Intent data){
        if(resultCode==1){

            getYoutubePlayerProvider().initialize(clave,this);
        }
    }
    protected YouTubePlayer.Provider getYoutubePlayerProvider(){
        return youTubePlayerView;
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
}