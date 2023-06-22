package com.example.aplikasiandroidsederhana

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class SocialAdapter(private val ListSocial: ArrayList<Social>) : RecyclerView.Adapter<SocialAdapter.socialViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Social)
    }

    inner class socialViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDesc: TextView = itemView.findViewById(R.id.tv_item_desc)
        val img: ImageView = itemView.findViewById(R.id.img_item_image)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): socialViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_social, parent, false)
        return socialViewHolder(view)
    }

    override fun onBindViewHolder(holder: socialViewHolder, position: Int) {
        val social = ListSocial[position]
        Glide.with(holder.itemView.context)
            .load(social.image)
            .apply(RequestOptions().override(55, 55))
            .into(holder.img)
        holder.tvName.text = social.name
        holder.tvDesc.text = social.desc

        holder.itemView.setOnClickListener {onItemClickCallback.onItemClicked(ListSocial[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return ListSocial.size
    }

}