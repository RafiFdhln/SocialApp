package com.example.aplikasiandroidsederhana

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvSocial: RecyclerView
    private var list: ArrayList<Social> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvSocial = findViewById(R.id.rv_social)
        rvSocial.setHasFixedSize(true)

        list.addAll(SocialData.ListSocial)
        showRecycleView()

    }

    fun showRecycleView() {
        rvSocial.layoutManager = LinearLayoutManager(this)
        val socialAdapter = SocialAdapter(list)
        rvSocial.adapter = socialAdapter

        socialAdapter.setOnItemClickCallback(object : SocialAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Social) {
                moveDetailActivity(data)
            }
        })
    }

    fun moveDetailActivity(data: Social) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_NAME, data.name)
        intent.putExtra(DetailActivity.EXTRA_DESC, data.desc)
        intent.putExtra(DetailActivity.EXTRA_IMAGE, data.image)
        intent.putExtra(DetailActivity.EXTRA_BORN, data.born)
        startActivity(intent)
    }
}