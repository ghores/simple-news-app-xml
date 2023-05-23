package com.example.simplenewsapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NewsAdaptor(var newsList: MutableList<News>) :
    RecyclerView.Adapter<NewsAdaptor.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val description: TextView
        val dateAndWriter: TextView
        val image: ImageView

        init {
            view.apply {
                title = findViewById(R.id.titleTv)
                description = findViewById(R.id.descTv)
                dateAndWriter = findViewById(R.id.dateWriterTv)
                image = findViewById(R.id.imageView)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_schema, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            title.text = newsList[position].title
            description.text = newsList[position].description
            dateAndWriter.text = newsList[position].date + " " + newsList[position].writer
            //  image.text = newsList[position].image
        }
    }
}