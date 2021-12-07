package den.project.newsapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import den.project.newsapplication.databinding.ActivityMainBinding
import den.project.newsapplication.model.FilterModel
import den.project.newsapplication.model.NewsModel
import den.project.newsapplication.presentation.FragmentNews
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val fragmentNews = FragmentNews.newInstance()
    private val newsModel: NewsModel by viewModel()
    private val filterNewsModel: FilterModel by viewModel()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentNews, fragmentNews)
            .commit()
    }
}