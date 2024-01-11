package com.example.lectoya;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lectoya.fragmentsAlumnoAula.minijuegosFragment;
import com.example.lectoya.fragmentsAlumnoAula.perfilFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new minijuegosFragment();
            case 1:
                return new perfilFragment();
            default:
                return new minijuegosFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
