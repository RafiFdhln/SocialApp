package com.example.aplikasiandroidsederhana

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_IMAGE = "extra_image"
        const val EXTRA_BORN = "extra_born"
    }

    @SuppressLint("MissingInflatedId", "RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName : TextView = findViewById(R.id.tv_detail_name)
        val tvDesc : TextView = findViewById(R.id.tv_detail_desc)
        val img : ImageView = findViewById(R.id.img_detail)
        val born : TextView = findViewById(R.id.tv_detail_born)
        val Share : Button = findViewById(R.id.Btn_share)

        tvName.text = intent.getStringExtra(EXTRA_NAME)
        tvDesc.text = intent.getStringExtra(EXTRA_DESC)
        born.text = intent.getStringExtra(EXTRA_BORN)
        img.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        supportActionBar?.apply {
             title = tvName.text
        }

        supportActionBar!!.setDefaultDisplayHomeAsUpEnabled(true)

        Share.setOnClickListener {
            val text = "${intent.getStringExtra(EXTRA_NAME)}\n" + "Rilis Pada " + "${intent.getStringExtra(EXTRA_BORN)}"

            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, text)
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }
    }
}