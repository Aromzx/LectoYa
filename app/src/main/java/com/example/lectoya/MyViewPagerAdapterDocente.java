package com.example.lectoya;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lectoya.fragmentsDocenteAula.aulasFragment;
import com.example.lectoya.fragmentsDocenteAula.alumnosFragment;
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
                return new aulasFragment();
            case 1:
                return new alumnosFragment();
            case 2:
                return new minijuegosDocenteFragment();
            case 3:
                return new perfilDocenteFragment();
            default:
                return new minijuegosDocenteFragment();
        }
    }
    @Override
    public int getItemCount() {
        return 4;
    }
}
