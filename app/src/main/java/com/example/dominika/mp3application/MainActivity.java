package com.example.dominika.mp3application;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, final int position, long id) {

                final Animation animBounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);

                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                animBounce.setInterpolator(interpolator);

                switch (position) {
                    case 0:

                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);

                            break;

                    case 1:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);
                        break;

                    case 2:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 2000);
                        break;
                    case 3:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 2000);
                        break;

                    case 4:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);
                        break;

                    case 5:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);
                        break;

                    case 6:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);
                        break;

                    case 7:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);
                        break;

                    case 8:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);
                        break;

                    case 9:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);
                        break;

                    case 10:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);
                        break;

                    case 11:
                        animBounce.setDuration(1000);
                        view.startAnimation(animBounce);

                        view.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                Intent i = new Intent(getApplicationContext(), FullImageActivity.class);
                                i.putExtra("id", position);
                                startActivity(i);

                            }
                        }, 1000);
                        break;

                    default:
                        break;
                }
            }
        });
    }
}
