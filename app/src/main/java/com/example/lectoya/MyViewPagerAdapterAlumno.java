package com.example.lectoya;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lectoya.fragmentsAlumnoAula.juegosAlumnoFragment;
import com.example.lectoya.fragmentsAlumnoAula.perfilAlumnoFragment;

public class MyViewPagerAdapterAlumno extends FragmentStateAdapter {
    public MyViewPagerAdapterAlumno(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new juegosAlumnoFragment();
            case 1:
                return new perfilAlumnoFragment();
            default:
                return new juegosAlumnoFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
