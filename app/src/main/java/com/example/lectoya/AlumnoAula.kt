package com.example.lectoya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback


class AlumnoAula : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alumno_aula)

        val tabLayout = findViewById<TabLayout>(R.id.tlAlumno_aula)
        val viewPager2 = findViewById<ViewPager2>(R.id.vp1)
        val myViewPagerAdapter = MyViewPagerAdapter(this)
        viewPager2.setAdapter(myViewPagerAdapter)

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    viewPager2.setCurrentItem(tab.getPosition())
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Código a ejecutar cuando se desmarca una pestaña
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Código a ejecutar cuando se vuelve a seleccionar la misma pestaña
            }
        })

        viewPager2.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                tabLayout.getTabAt(position)?.select()
            }
        })



    }
}


