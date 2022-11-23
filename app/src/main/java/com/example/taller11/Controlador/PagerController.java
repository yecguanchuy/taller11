package com.example.taller11.Controlador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerController extends FragmentStatePagerAdapter {

    int numoftabs;

    public PagerController(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        this.numoftabs = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new informacion();
            case 1:
                return new fotos();
            case 2:
                return new contacto();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}
