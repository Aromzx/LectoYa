package com.example.lectoya;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.lectoya.fragmentsDocenteAula.alumnosDocenteFragment;
import com.example.lectoya.fragmentsDocenteAula.minijuegosDocenteFragment;
import com.example.lectoya.fragmentsDocenteAula.perfilDocenteFragment;

public class MyViewPagerAdapterDocente extends FragmentStateAdapter {

    public MyViewPagerAdapterDocente(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new alumnosDocenteFragment();
            case 1:
                return new minijuegosDocenteFragment();
            case 2:
                return new perfilDocenteFragment();
            default:
                return new alumnosDocenteFragment();
        }
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}
