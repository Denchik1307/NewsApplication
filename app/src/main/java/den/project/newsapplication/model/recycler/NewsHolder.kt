package den.project.newsapplication.model.recycler

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import den.project.newsapplication.data.NewsData
import den.project.newsapplication.databinding.RecyclerNewsModelBinding

class NewsHolder(item: View) : RecyclerView.ViewHolder(item) {
    private val binding = RecyclerNewsModelBinding.bind(item)

    fun bind(news: NewsData) = with(binding) {
        newsTopic.text = news.topicNews
        newsName.text = news.nameNews
        newsText.text = news.textNews
        newsData.text = news.dataNews
        newsAuthor.text = news.authorNews
    }
}