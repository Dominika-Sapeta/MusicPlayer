package com.example.dominika.mp3application;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class ImageAdapter extends BaseAdapter {

    private MediaPlayer mediaPlayer;
    private Context context;
    public Integer[] images={
            R.drawable.image_1, R.drawable.image_2,
            R.drawable.image_3, R.drawable.image_4,
            R.drawable.image_5, R.drawable.image_6,
            R.drawable.image_7, R.drawable.image_8,
            R.drawable.image_9, R.drawable.image_10,
            R.drawable.image_11, R.drawable.image_12
    };


    public Integer[] songs={
            R.raw.song_4, R.raw.song_9,
            R.raw.song_3, R.raw.song_10,
            R.raw.song_7, R.raw.song_5,
            R.raw.song_6, R.raw.song_2,
            R.raw.song_11, R.raw.song_8,
            R.raw.song_1, R.raw.song_12
    };

    public ImageAdapter(Context c){
        this.context = c;
    }

    @Override
    public int getCount() {
        return images.length;
    }


    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240, 240));
        return imageView;
    }
}
