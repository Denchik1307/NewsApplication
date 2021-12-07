package den.project.newsapplication.model.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import den.project.newsapplication.R
import den.project.newsapplication.data.NewsData

class NewsAdapter : RecyclerView.Adapter<NewsHolder>() {
    private var news = mutableListOf<NewsData>()

    companion object {
        fun newInstance() = NewsAdapter()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_news_model, parent, false)
        return NewsHolder(viewHolder)
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        holder.bind(news[position])
    }

    override fun getItemCount(): Int {
        return news.size
    }

    fun showNews(news: List<NewsData>) {
        this.news = news.toMutableList()
    }


}