package den.project.newsapplication.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import den.project.newsapplication.data.NewsData

class NewsModel : ViewModel() {

    private var _news = MutableLiveData<List<NewsData>>()
    var news: LiveData<List<NewsData>>
        get() = _news
        set(value) {
            _news = value as MutableLiveData<List<NewsData>>
        }
}