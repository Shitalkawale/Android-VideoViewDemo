package com.example.vedioviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView mvideoView;
    EditText txt;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mvideoView=findViewById(R.id.videoView);
        txt=findViewById(R.id.getname);
        btn=findViewById(R.id.loadvideo);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaController mediaController=new MediaController(MainActivity.this);
                mvideoView.setMediaController(mediaController);

                Uri uri=Uri.parse("https://wrapround-primes.000webhostapp.com/myvideo/a.mp4");
                mvideoView.setVideoURI(uri);

                //mvideoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.nature));

                mvideoView.start();

            }
        });


//        MediaController mediaController=new MediaController(MainActivity.this);
//        mvideoView.setMediaController(mediaController);
//
//        //Uri uri=Uri.parse("https://vimeo.com/manage/videos/"+txt.getText().toString().trim()+".mp4");
//        //Uri uri=Uri.parse("https://vimeo.com/570895477");
//        //mvideoView.setVideoURI(uri);
//
//        mvideoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.nature));
//
//        mvideoView.start();

    }
}