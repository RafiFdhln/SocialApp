package com.example.aplikasiandroidsederhana

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AboutActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.apply {
            title = getString(R.string.about_me)
        }
        supportActionBar!!.setDefaultDisplayHomeAsUpEnabled(true)
    }
}