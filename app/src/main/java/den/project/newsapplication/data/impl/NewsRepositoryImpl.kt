package den.project.newsapplication.data.impl

import den.project.newsapplication.data.NewsData
import den.project.newsapplication.data.NewsRepository
import den.project.newsapplication.resourcesnews.RESOURCES_NEWS

class NewsRepositoryImpl : NewsRepository {
    override fun getNews(): ArrayList<NewsData> {
        return RESOURCES_NEWS
    }
}