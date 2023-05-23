package com.example.simplenewsapp.adaptor

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.simplenewsapp.model.News
import com.example.simplenewsapp.R
import com.example.simplenewsapp.activities.WebPageActivity

class NewsAdaptor(
    var newsList: MutableList<News>,
    var context: Context
) :
    RecyclerView.Adapter<NewsAdaptor.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
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
                title.setOnClickListener {
                    val intent = Intent(context, WebPageActivity::class.java)
                    intent.putExtra("url",newsList[adapterPosition].url)
                    context.startActivity(intent)
                }
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
            dateAndWriter.text = newsList[position].publishedAt + "\n" + newsList[position].author
            Glide.with(context).load(newsList[position].urlToImage).into(image)
        }
    }
}