package com.akumoshop.akumo.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit -> declare variable
    private ListView trafficListView;
    private Button aboutmeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind widget
        bindWidget();

        //Button Controller
        //alt+enter to create method
        buttonController();


    } // Main Method

    private void buttonController() {
        //ctrl+space to show collection of new method (new View.OnClickListener)
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                //ctrl+space to automatic create variable
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.mosquito);
                mediaPlayer.start();

                //web View
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("https://youtu.be/xdI-r3KFQmo"));
                //startActivity(intent);

            } //onClick
        });

    } //buttonController

    private void bindWidget() {
        //alt+enter to show "cast to"
        //ctrl+space to suggest word
        //ctrl+shift+enter to completement statement
        //ctrl+alt+L to auto format

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutmeButton = (Button) findViewById(R.id.button);

    } //bindWidget

} // Main Class
