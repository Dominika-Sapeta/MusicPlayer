package com.example.dominika.mp3application;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.SeekBar;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSeven extends Fragment {

    private Button play,stop;
    private SeekBar volume;
    private AudioManager audioManager;

    public FragmentSeven() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =  inflater.inflate(R.layout.layout_fragment_seven, container, false);
        play = (Button) rootView.findViewById(R.id.play);
        stop = (Button) rootView.findViewById(R.id.stop);

        final MediaPlayer mediaPlayer = MediaPlayer.create(getActivity(), R.raw.song_6);
        audioManager = (AudioManager) getActivity().getSystemService(getActivity().AUDIO_SERVICE);
        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        SeekBar volControl = (SeekBar) rootView.findViewById(R.id.volume);
        final Animation animBounce = AnimationUtils.loadAnimation(getActivity(),R.anim.bounce);

        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
        animBounce.setInterpolator(interpolator);

        play.startAnimation(animBounce);
        stop.startAnimation(animBounce);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(FullImageActivity.this, MainActivity.class);
                //    FullImageActivity.this.finish();
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
                //   startActivity(intent);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(FullImageActivity.this, MainActivity.class);
                //    FullImageActivity.this.finish();
                mediaPlayer.pause();
                //   startActivity(intent);
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

        return rootView;
    }

}
