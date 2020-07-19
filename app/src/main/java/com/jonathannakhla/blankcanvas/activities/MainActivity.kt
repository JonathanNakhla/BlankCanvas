package com.jonathannakhla.blankcanvas.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jonathannakhla.blankcanvas.R
import com.jonathannakhla.blankcanvas.fragments.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.main_container, MainFragment.newInstance(), MainFragment.TAG)
                .commit()
        }
    }
}
