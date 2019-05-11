package com.example.izudinqasam.livedataexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fram1, Frag1())
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fram2, Frag2())
            .commit()
    }
}
