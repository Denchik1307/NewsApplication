package den.project.newsapplication.data

import den.project.newsapplication.data.NewsData

interface NewsRepository {
    fun getNews(): ArrayList<NewsData>
}