package com.example.dominika.mp3application;


import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v4.view.GestureDetectorCompat;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;

public class FullImageActivity extends Activity {

    private GestureDetectorCompat gestureObject;
    private Button play, stop;
    private SeekBar volume;
    private AudioManager audioManager;

    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);
        gestureObject = new GestureDetectorCompat(this, new FullImageActivity.LearnGesture());

        play = (Button) findViewById(R.id.play);
        stop = (Button) findViewById(R.id.stop);
        volume = (SeekBar) findViewById(R.id.volume);

        Intent i = getIntent();

        int position = i.getExtras().getInt("id");
        ImageAdapter adapter = new ImageAdapter(this);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[position]);


        mPlayer = MediaPlayer.create(FullImageActivity.this, adapter.songs[position]);
        audioManager = (AudioManager)getSystemService(this.AUDIO_SERVICE);
        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        SeekBar volControl = (SeekBar)findViewById(R.id.volume);

        final Animation animBounce = AnimationUtils.loadAnimation(this,R.anim.bounce);

        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        animBounce.setInterpolator(interpolator);

        play.startAnimation(animBounce);
        stop.startAnimation(animBounce);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mPlayer.start();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mPlayer.pause();
            }
        });


        volControl.setMax(maxVolume);
        volControl.setProgress(curVolume);
        volControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onStartTrackingTouch(SeekBar arg0) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onProgressChanged(SeekBar arg0, int arg1, boolean arg2) {
                // TODO Auto-generated method stub
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, arg1, 0);
            }
        });


    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureObject.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    private class LearnGesture extends GestureDetector.SimpleOnGestureListener{

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

            if(e2.getX() > e1.getX()){
                Intent intent = new Intent(FullImageActivity.this, FragmentManager.class);
               FullImageActivity.this.finish();
               startActivity(intent);
            }
            else

            if(e2.getX() < e1.getX()){
               Intent intent = new Intent(FullImageActivity.this, FragmentManager.class);
               FullImageActivity.this.finish();
               startActivity(intent);
            }

            return true;
        }
    }
}
