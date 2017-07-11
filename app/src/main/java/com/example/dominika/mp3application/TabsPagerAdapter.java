package com.example.dominika.mp3application;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TabsPagerAdapter extends FragmentPagerAdapter {



    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                // Top Rated fragment activity
                return new FragmentOne();
            case 1:
                // Games fragment activity
                return new FragmentTwo();
            case 2:
                // Movies fragment activity
                return new FragmentThree();
            case 3:
                // Top Rated fragment activity
                return new FragmentFour();
            case 4:
                // Games fragment activity
                return new FragmentFive();
            case 5:
                // Movies fragment activity
                return new FragmentSix();
            case 6:
                // Top Rated fragment activity
                return new FragmentSeven();
            case 7:
                // Games fragment activity
                return new FragmentEight();
            case 8:
                // Movies fragment activity
                return new FragmentNine();
            case 9:
                // Top Rated fragment activity
                return new FragmentTen();
            case 10:
                // Games fragment activity
                return new FragmentEleven();
            case 11:
                // Movies fragment activity
                return new FragmentTwelve();
            default:
                break;
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 12;
    }

}