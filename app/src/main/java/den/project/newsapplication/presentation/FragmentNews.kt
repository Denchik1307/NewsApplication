package den.project.newsapplication.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import den.project.newsapplication.data.NewsData
import den.project.newsapplication.data.NewsRepository
import den.project.newsapplication.data.impl.NewsRepositoryImpl
import den.project.newsapplication.databinding.FragmentNewsBinding
import den.project.newsapplication.model.NewsModel
import den.project.newsapplication.model.recycler.NewsAdapter
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class FragmentNews : Fragment() {
    lateinit var binding: FragmentNewsBinding
    private var newsModel: NewsModel by sharedViewModel()
    private var news:NewsRepository = NewsRepositoryImpl()
    private val new = news.getNews()
    private val newsAdapter = NewsAdapter.newInstance()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            showNews.layoutManager = LinearLayoutManager(context)
            showNews.adapter = newsAdapter
        }
        initObserve()
        show(new)
    }

    companion object {
        @JvmStatic
        fun newInstance() = FragmentNews()
    }

    private fun initObserve() {
        newsModel.news.observe(viewLifecycleOwner) {
            newsAdapter.showNews(new)
        }
    }

    private fun show(newsData: ArrayList<NewsData>) {
        newsModel.news = newsData
    }
}